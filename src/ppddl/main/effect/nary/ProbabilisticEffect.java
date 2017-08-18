package ppddl.main.effect.nary;

import java.util.List;

import ppddl.exception.EffectException;
import ppddl.exception.ProbabilityException;
import ppddl.exception.RequirementsException;
import ppddl.main.Requirements;
import ppddl.main.annotation.AnnotatedEffect;
import ppddl.main.effect.NaryEffect;

public class ProbabilisticEffect extends NaryEffect<AnnotatedEffect> {
	
	public ProbabilisticEffect(List<AnnotatedEffect> arguments) throws EffectException, ProbabilityException {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new EffectException("probabilistic effects need at least two children");
		}
		this.validate();
	}
	
	public ProbabilisticEffect(AnnotatedEffect... arguments) throws EffectException, ProbabilityException {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new EffectException("probabilistic effects need at least two children");
		}
		this.validate();
	}
	
	public void validate() throws ProbabilityException {
		double sum = 0;
		for(AnnotatedEffect probEffect : this.getChildren()) {
			sum += probEffect.getProbability().getNumber().doubleValue();
		}
		if(sum > 1) {
			throw new ProbabilityException("sum of probabilities is greater than 1");
		}
	}

	@Override
	public String getSymbol() {
		return "probabilistic";
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledProbabilisticEffects()) {
			throw new RequirementsException("probabilistic effects are defined but :probabilistic-effects is not required");
		}
		for(AnnotatedEffect annotatedEffect : this.getChildren()) {
			annotatedEffect.getChild().validate(requireDef);
		}
	}

}

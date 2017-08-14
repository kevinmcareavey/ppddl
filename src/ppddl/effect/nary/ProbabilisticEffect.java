package ppddl.effect.nary;

import java.util.List;

import ppddl.Requirements;
import ppddl.annotation.AnnotatedEffect;
import ppddl.effect.NaryEffect;

public class ProbabilisticEffect extends NaryEffect<AnnotatedEffect> {
	
	public ProbabilisticEffect(List<AnnotatedEffect> arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("probabilistic effects need at least two children");
		}
		this.validate();
	}
	
	public ProbabilisticEffect(AnnotatedEffect... arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("probabilistic effects need at least two children");
		}
		this.validate();
	}
	
	public void validate() throws Exception {
		double sum = 0;
		for(AnnotatedEffect probEffect : this.getChildren()) {
			sum += probEffect.getProbability().getNumber().doubleValue();
		}
		if(sum > 1) {
			throw new Exception("sum of probabilities is greater than 1");
		}
	}

	@Override
	public String getSymbol() {
		return "probabilistic";
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(!requireDef.isEnabledProbabilisticEffects()) {
			throw new Exception("probabilistic effects are defined but :probabilistic-effects is not required");
		}
		for(AnnotatedEffect annotatedEffect : this.getChildren()) {
			annotatedEffect.getChild().validate(requireDef);
		}
	}

}

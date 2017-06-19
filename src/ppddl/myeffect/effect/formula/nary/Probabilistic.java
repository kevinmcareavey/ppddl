package ppddl.myeffect.effect.formula.nary;

import java.util.List;

import ppddl.myeffect.ProbEffect;
import ppddl.myeffect.effect.formula.Nary;

public class Probabilistic extends Nary<ProbEffect> {
	
	public Probabilistic(List<ProbEffect> arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("probabilistic effects need at least two children");
		}
		this.validate();
	}
	
	public Probabilistic(ProbEffect... arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("probabilistic effects need at least two children");
		}
		this.validate();
	}
	
	public void validate() throws Exception {
		double sum = 0;
		for(ProbEffect probEffect : this.getChildren()) {
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

}

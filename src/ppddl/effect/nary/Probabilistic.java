package ppddl.effect.nary;

import java.util.List;

import ppddl.annotated.AnnotatedEffect;
import ppddl.effect.NaryEffect;

public class Probabilistic extends NaryEffect<AnnotatedEffect> {
	
	public Probabilistic(List<AnnotatedEffect> arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("probabilistic effects need at least two children");
		}
		this.validate();
	}
	
	public Probabilistic(AnnotatedEffect... arguments) throws Exception {
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

}

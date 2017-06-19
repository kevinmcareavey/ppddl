package ppddl.myeffect;

import ppddl.MyEffect;
import ppddl.fexp.mynumber.Probability;

public class ProbEffect extends MyEffect {
	
	private Probability probability;
	private Effect effect;
	
	public ProbEffect(Probability probability, Effect effect) {
		this.setProbability(probability);
		this.setEffect(effect);
	}

	public Probability getProbability() {
		return probability;
	}

	public void setProbability(Probability probability) {
		this.probability = probability;
	}

	public Effect getEffect() {
		return effect;
	}

	public void setEffect(Effect effect) {
		this.effect = effect;
	}

	@Override
	public String toString() {
		return this.getProbability() + " " + this.getEffect();
	}
	
}

package ppddl;

import ppddl.fexp.mynumber.Probability;

public class ProbInitEl {
	
	private Probability probability;
	private AInitEl aInitEl;
	
	public ProbInitEl(Probability probability, AInitEl aInitEl) {
		this.setProbability(probability);
		this.setaInitEl(aInitEl);
	}
	
	public Probability getProbability() {
		return probability;
	}
	
	public void setProbability(Probability probability) {
		this.probability = probability;
	}
	
	public AInitEl getaInitEl() {
		return aInitEl;
	}
	
	public void setaInitEl(AInitEl aInitEl) {
		this.aInitEl = aInitEl;
	}

	@Override
	public String toString() {
		return this.getProbability().toString() + " " + this.getaInitEl().toString();
	}

}

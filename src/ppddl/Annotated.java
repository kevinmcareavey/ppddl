package ppddl;

import ppddl.arithmeticexpression.mynumber.Probability;

public class Annotated<T> {
	
	private Probability probability;
	private T child;
	
	public Annotated(Probability probability, T child) {
		this.setProbability(probability);
		this.setChild(child);
	}

	public Probability getProbability() {
		return probability;
	}

	public void setProbability(Probability probability) {
		this.probability = probability;
	}

	public T getChild() {
		return child;
	}

	public void setChild(T child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return this.getProbability() + " " + this.getChild();
	}

}

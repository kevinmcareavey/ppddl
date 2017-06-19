package ppddl.precondition;

import ppddl.Precondition;

public abstract class UnaryPrecondition<T> extends Precondition {
	
	private T child;
	
	public UnaryPrecondition(T child) {
		this.setChild(child);
	}
	
	public T getChild() {
		return child;
	}

	public void setChild(T child) {
		this.child = child;
	}
	
	public abstract String getSymbol();

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " " + this.getChild() + ")";
	}
	
}

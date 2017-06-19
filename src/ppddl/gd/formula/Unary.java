package ppddl.gd.formula;

import ppddl.gd.Formula;

public abstract class Unary<T> extends Formula {
	
	private T child;
	
	public Unary(T child) {
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

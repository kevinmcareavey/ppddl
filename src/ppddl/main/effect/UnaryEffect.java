package ppddl.main.effect;

import ppddl.main.Effect;

public abstract class UnaryEffect<T> extends Effect {
	
	private T child;
	
	public UnaryEffect(T child) {
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

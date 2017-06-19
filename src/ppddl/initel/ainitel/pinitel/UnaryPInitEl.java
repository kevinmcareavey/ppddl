package ppddl.initel.ainitel.pinitel;

import ppddl.initel.ainitel.PInitEl;

public abstract class UnaryPInitEl<T> extends PInitEl {
	
	private T child;
	
	public UnaryPInitEl(T child) {
		this.setChild(child);
	}

	public T getChild() {
		return child;
	}

	public void setChild(T child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return this.getChild().toString();
	}

}

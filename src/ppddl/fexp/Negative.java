package ppddl.fexp;

import ppddl.FExp;

public class Negative extends FExp {
	
	private FExp child;
	
	public Negative(FExp child) {
		this.setChild(child);
	}

	public FExp getChild() {
		return child;
	}
	
	public void setChild(FExp child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "(-" + this.getChild() + ")";
	}
	
}

package ppddl.arithmeticexpression;

import ppddl.ArithmeticExpression;

public class Negative extends ArithmeticExpression {
	
	private ArithmeticExpression child;
	
	public Negative(ArithmeticExpression child) {
		this.setChild(child);
	}

	public ArithmeticExpression getChild() {
		return child;
	}
	
	public void setChild(ArithmeticExpression child) {
		this.child = child;
	}
	
	@Override
	public boolean isGround() {
		return this.getChild().isGround();
	}

	@Override
	public String toString() {
		return "(-" + this.getChild() + ")";
	}
	
}

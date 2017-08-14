package ppddl.arithmetic_expression;

import ppddl.ArithmeticExpression;
import ppddl.Requirements;

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
	public void validate(Requirements requireDef) throws Exception {
		// Supported by default
	}
	
	@Override
	public boolean constainsReward() {
		return this.getChild().constainsReward();
	}

	@Override
	public String toString() {
		return "(-" + this.getChild() + ")";
	}
	
}

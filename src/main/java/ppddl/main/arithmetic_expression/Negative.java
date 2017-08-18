package ppddl.main.arithmetic_expression;

import ppddl.exception.RequirementsException;
import ppddl.main.ArithmeticExpression;
import ppddl.main.Requirements;

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
	public void validate(Requirements requireDef) throws RequirementsException {
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

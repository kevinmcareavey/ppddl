package ppddl.arithmetic_expression;

import ppddl.ArithmeticExpression;
import ppddl.Requirements;

public class MyNumber extends ArithmeticExpression {
	
	private Number number;
	
	public MyNumber(Number number) {
		this.setNumber(number);
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}
	
	@Override
	public boolean isGround() {
		return true;
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		// Supported by default
	}
	
	@Override
	public boolean constainsReward() {
		return false;
	}
	
	@Override
	public String toString() {
		return this.getNumber().toString();
	}

}

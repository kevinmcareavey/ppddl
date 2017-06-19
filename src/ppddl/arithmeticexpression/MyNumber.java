package ppddl.arithmeticexpression;

import ppddl.ArithmeticExpression;

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
	public String toString() {
		return this.getNumber().toString();
	}

}

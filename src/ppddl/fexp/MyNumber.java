package ppddl.fexp;

import ppddl.FExp;

public class MyNumber extends FExp {
	
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
	public String toString() {
		return this.getNumber().toString();
	}

}

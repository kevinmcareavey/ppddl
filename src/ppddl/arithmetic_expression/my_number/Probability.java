package ppddl.arithmetic_expression.my_number;

import ppddl.arithmetic_expression.MyNumber;

public class Probability extends MyNumber {

	public Probability(Number number) throws Exception {
		super(number);
		if(number.doubleValue() < 0 || number.doubleValue() > 1) {
			throw new Exception("invalid probability value");
		}
	}

}

package ppddl.main.arithmetic_expression.my_number;

import ppddl.exception.ProbabilityException;
import ppddl.main.arithmetic_expression.MyNumber;

public class Probability extends MyNumber {

	public Probability(Number number) throws ProbabilityException {
		super(number);
		if(number.doubleValue() < 0 || number.doubleValue() > 1) {
			throw new ProbabilityException("invalid probability value");
		}
	}

}

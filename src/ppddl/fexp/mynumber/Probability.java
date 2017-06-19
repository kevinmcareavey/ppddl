package ppddl.fexp.mynumber;

import ppddl.fexp.MyNumber;

public class Probability extends MyNumber {

	public Probability(Number number) throws Exception {
		super(number);
		if(number.doubleValue() < 0 || number.doubleValue() > 1) {
			throw new Exception("invalid probability value");
		}
	}

}

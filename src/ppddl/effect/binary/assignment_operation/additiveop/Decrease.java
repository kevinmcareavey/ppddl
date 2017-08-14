package ppddl.effect.binary.assignment_operation.additiveop;

import ppddl.ArithmeticExpression;
import ppddl.effect.binary.assignment_operation.AdditiveOperation;

public class Decrease extends AdditiveOperation {

	public Decrease(ArithmeticExpression right)  throws Exception {
		super(right);
	}

	@Override
	public String getSymbol() {
		return "decrease";
	}

}

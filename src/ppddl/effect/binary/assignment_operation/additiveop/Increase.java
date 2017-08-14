package ppddl.effect.binary.assignment_operation.additiveop;

import ppddl.ArithmeticExpression;
import ppddl.effect.binary.assignment_operation.AdditiveOperation;

public class Increase extends AdditiveOperation {
	
	public Increase(ArithmeticExpression right)  throws Exception {
		super(right);
	}

	@Override
	public String getSymbol() {
		return "increase";
	}

}

package ppddl.main.effect.binary.assignment_operation.additiveop;

import ppddl.exception.EffectException;
import ppddl.main.ArithmeticExpression;
import ppddl.main.arithmetic_expression.Function;
import ppddl.main.effect.binary.AssignmentOperation;

public class Increase extends AssignmentOperation {
	
	public Increase(Function left, ArithmeticExpression right) throws EffectException {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "increase";
	}

}

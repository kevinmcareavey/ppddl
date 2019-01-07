package ppddl.main.effect.binary.assignment_operation.additiveop;

import ppddl.exception.EffectException;
import ppddl.main.ArithmeticExpression;
import ppddl.main.arithmetic_expression.Function;
import ppddl.main.effect.binary.AssignmentOperation;

public class Decrease extends AssignmentOperation {

	public Decrease(Function left, ArithmeticExpression right) throws EffectException {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "decrease";
	}

}

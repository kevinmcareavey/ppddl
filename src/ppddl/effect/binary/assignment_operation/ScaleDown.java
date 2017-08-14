package ppddl.effect.binary.assignment_operation;

import ppddl.ArithmeticExpression;
import ppddl.arithmetic_expression.Function;
import ppddl.effect.binary.AssignmentOperation;

public class ScaleDown extends AssignmentOperation {
	
	public ScaleDown(Function left, ArithmeticExpression right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "scale-down";
	}

}

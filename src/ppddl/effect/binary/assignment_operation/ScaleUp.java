package ppddl.effect.binary.assignment_operation;

import ppddl.ArithmeticExpression;
import ppddl.arithmetic_expression.Function;
import ppddl.effect.binary.AssignmentOperation;

public class ScaleUp extends AssignmentOperation {
	
	public ScaleUp(Function left, ArithmeticExpression right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "scale-up";
	}

}

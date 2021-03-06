package ppddl.main.effect.binary.assignment_operation;

import ppddl.main.ArithmeticExpression;
import ppddl.main.arithmetic_expression.Function;
import ppddl.main.effect.binary.AssignmentOperation;

public class ScaleUp extends AssignmentOperation {
	
	public ScaleUp(Function left, ArithmeticExpression right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "scale-up";
	}

}

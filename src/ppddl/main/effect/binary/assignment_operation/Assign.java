package ppddl.main.effect.binary.assignment_operation;

import ppddl.main.ArithmeticExpression;
import ppddl.main.arithmetic_expression.Function;
import ppddl.main.effect.binary.AssignmentOperation;

public class Assign extends AssignmentOperation {

	public Assign(Function left, ArithmeticExpression right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "assign";
	}
	
}

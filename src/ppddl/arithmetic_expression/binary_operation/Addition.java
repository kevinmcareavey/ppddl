package ppddl.arithmetic_expression.binary_operation;

import ppddl.ArithmeticExpression;
import ppddl.arithmetic_expression.BinaryOperation;

public class Addition extends BinaryOperation {

	public Addition(ArithmeticExpression leftChild, ArithmeticExpression rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "+";
	}

}

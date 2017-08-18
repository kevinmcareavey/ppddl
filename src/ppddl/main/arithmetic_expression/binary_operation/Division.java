package ppddl.main.arithmetic_expression.binary_operation;

import ppddl.main.ArithmeticExpression;
import ppddl.main.arithmetic_expression.BinaryOperation;

public class Division extends BinaryOperation {
	
	public Division(ArithmeticExpression leftChild, ArithmeticExpression rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "/";
	}
	
}

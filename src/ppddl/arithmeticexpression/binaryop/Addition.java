package ppddl.arithmeticexpression.binaryop;

import ppddl.ArithmeticExpression;
import ppddl.arithmeticexpression.BinaryOp;

public class Addition extends BinaryOp {

	public Addition(ArithmeticExpression leftChild, ArithmeticExpression rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "+";
	}

}

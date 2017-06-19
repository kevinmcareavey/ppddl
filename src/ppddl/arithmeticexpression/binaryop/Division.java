package ppddl.arithmeticexpression.binaryop;

import ppddl.ArithmeticExpression;
import ppddl.arithmeticexpression.BinaryOp;

public class Division extends BinaryOp {
	
	public Division(ArithmeticExpression leftChild, ArithmeticExpression rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "/";
	}
	
}

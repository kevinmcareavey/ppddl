package ppddl.arithmeticexpression.binaryop;

import ppddl.ArithmeticExpression;
import ppddl.arithmeticexpression.BinaryOp;

public class Multiplication extends BinaryOp {
	
	public Multiplication(ArithmeticExpression leftChild, ArithmeticExpression rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "*";
	}

}

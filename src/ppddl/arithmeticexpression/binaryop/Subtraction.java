package ppddl.arithmeticexpression.binaryop;

import ppddl.ArithmeticExpression;
import ppddl.arithmeticexpression.BinaryOp;

public class Subtraction extends BinaryOp {
	
	public Subtraction(ArithmeticExpression leftChild, ArithmeticExpression rightChild) {
		super(leftChild, rightChild);
	}
	
	@Override
	public String getSymbol() {
		return "-";
	}

}

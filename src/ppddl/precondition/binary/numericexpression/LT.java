package ppddl.precondition.binary.numericexpression;

import ppddl.ArithmeticExpression;
import ppddl.precondition.binary.NumericExpression;

public class LT extends NumericExpression {
	
	public LT(ArithmeticExpression leftChild, ArithmeticExpression rightChild) {
		super(leftChild, rightChild);
	}
	
	@Override
	public String getSymbol() {
		return "<";
	}

}

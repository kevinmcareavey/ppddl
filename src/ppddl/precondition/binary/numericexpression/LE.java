package ppddl.precondition.binary.numericexpression;

import ppddl.ArithmeticExpression;
import ppddl.precondition.binary.NumericExpression;

public class LE extends NumericExpression {
	
	public LE(ArithmeticExpression leftChild, ArithmeticExpression rightChild) {
		super(leftChild, rightChild);
	}
	
	@Override
	public String getSymbol() {
		return "<=";
	}

}

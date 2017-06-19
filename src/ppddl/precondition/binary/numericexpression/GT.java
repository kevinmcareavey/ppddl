package ppddl.precondition.binary.numericexpression;

import ppddl.ArithmeticExpression;
import ppddl.precondition.binary.NumericExpression;

public class GT extends NumericExpression {
	
	public GT(ArithmeticExpression leftChild, ArithmeticExpression rightChild) {
		super(leftChild, rightChild);
	}
	
	@Override
	public String getSymbol() {
		return ">";
	}

}

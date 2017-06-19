package ppddl.precondition.binary;

import ppddl.ArithmeticExpression;
import ppddl.precondition.BinaryPrecondition;

public abstract class NumericExpression extends BinaryPrecondition<ArithmeticExpression, ArithmeticExpression> {
	
	public NumericExpression(ArithmeticExpression leftChild, ArithmeticExpression rightChild) {
		super(leftChild, rightChild);
	}
	
}

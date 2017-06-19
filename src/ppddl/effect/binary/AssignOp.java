package ppddl.effect.binary;

import ppddl.ArithmeticExpression;
import ppddl.arithmeticexpression.Function;
import ppddl.effect.BinaryEffect;

public abstract class AssignOp extends BinaryEffect<Function, ArithmeticExpression> {
	
	public AssignOp(Function leftChild, ArithmeticExpression rightChild) {
		super(leftChild, rightChild);
	}

}

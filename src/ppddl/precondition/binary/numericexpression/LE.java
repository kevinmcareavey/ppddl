package ppddl.precondition.binary.numericexpression;

import ppddl.ArithmeticExpression;
import ppddl.precondition.binary.NumericPrecondition;

public class LE extends NumericPrecondition {
	
	public LE(ArithmeticExpression leftChild, ArithmeticExpression rightChild) throws Exception {
		super(leftChild, rightChild);
	}
	
	@Override
	public String getSymbol() {
		return "<=";
	}

}

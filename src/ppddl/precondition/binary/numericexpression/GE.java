package ppddl.precondition.binary.numericexpression;

import ppddl.ArithmeticExpression;
import ppddl.precondition.binary.NumericPrecondition;

public class GE extends NumericPrecondition {
	
	public GE(ArithmeticExpression leftChild, ArithmeticExpression rightChild) throws Exception {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return ">=";
	}

}

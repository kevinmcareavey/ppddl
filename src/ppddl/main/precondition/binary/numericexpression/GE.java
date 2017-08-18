package ppddl.main.precondition.binary.numericexpression;

import ppddl.exception.PreconditionException;
import ppddl.main.ArithmeticExpression;
import ppddl.main.precondition.binary.NumericPrecondition;

public class GE extends NumericPrecondition {
	
	public GE(ArithmeticExpression leftChild, ArithmeticExpression rightChild) throws PreconditionException {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return ">=";
	}

}

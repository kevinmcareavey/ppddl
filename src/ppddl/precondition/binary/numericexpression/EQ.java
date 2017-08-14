package ppddl.precondition.binary.numericexpression;

import ppddl.ArithmeticExpression;
import ppddl.precondition.binary.NumericPrecondition;

public class EQ extends NumericPrecondition {

	public EQ(ArithmeticExpression leftChild, ArithmeticExpression rightChild) throws Exception {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "=";
	}

}

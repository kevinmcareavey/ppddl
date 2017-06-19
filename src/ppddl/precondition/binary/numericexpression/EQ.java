package ppddl.precondition.binary.numericexpression;

import ppddl.ArithmeticExpression;
import ppddl.precondition.binary.NumericExpression;

public class EQ extends NumericExpression {

	public EQ(ArithmeticExpression leftChild, ArithmeticExpression rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "=";
	}

}

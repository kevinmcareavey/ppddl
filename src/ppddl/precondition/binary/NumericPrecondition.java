package ppddl.precondition.binary;

import ppddl.ArithmeticExpression;
import ppddl.Requirements;
import ppddl.arithmetic_expression.Function;
import ppddl.precondition.BinaryPrecondition;

public abstract class NumericPrecondition extends BinaryPrecondition<ArithmeticExpression, ArithmeticExpression> {
	
	public NumericPrecondition(ArithmeticExpression leftChild, ArithmeticExpression rightChild) throws Exception {
		super(leftChild, rightChild);
		if(leftChild.equals(Function.REWARD) || rightChild.equals(Function.REWARD)) {
			throw new Exception(Function.REWARD + " not permitted in preconditions");
		}
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(!requireDef.isEnabledFluents()) {
			throw new Exception("numeric expressions are defined but :fluents is not required");
		}
	}
	
}

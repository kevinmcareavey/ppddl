package ppddl.main.precondition.binary;

import ppddl.exception.PreconditionException;
import ppddl.exception.RequirementsException;
import ppddl.main.ArithmeticExpression;
import ppddl.main.Requirements;
import ppddl.main.arithmetic_expression.Function;
import ppddl.main.precondition.BinaryPrecondition;

public abstract class NumericPrecondition extends BinaryPrecondition<ArithmeticExpression, ArithmeticExpression> {
	
	public NumericPrecondition(ArithmeticExpression leftChild, ArithmeticExpression rightChild) throws PreconditionException {
		super(leftChild, rightChild);
		if(leftChild.equals(Function.REWARD) || rightChild.equals(Function.REWARD)) {
			throw new PreconditionException(Function.REWARD + " not permitted in preconditions");
		}
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledFluents()) {
			throw new RequirementsException("numeric expressions are defined but :fluents is not required");
		}
	}
	
}

package ppddl.main.effect.binary;

import ppddl.exception.RequirementsException;
import ppddl.main.ArithmeticExpression;
import ppddl.main.Requirements;
import ppddl.main.arithmetic_expression.Function;
import ppddl.main.effect.BinaryEffect;

public abstract class AssignmentOperation extends BinaryEffect<Function, ArithmeticExpression> {
	
	public AssignmentOperation(Function leftChild, ArithmeticExpression rightChild) {
		super(leftChild, rightChild);
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledConditionalEffects()) {
			throw new RequirementsException("assignment operations are defined but :fluents is not required");
		}
	}

}

package ppddl.effect.binary;

import ppddl.ArithmeticExpression;
import ppddl.Requirements;
import ppddl.arithmetic_expression.Function;
import ppddl.effect.BinaryEffect;

public abstract class AssignmentOperation extends BinaryEffect<Function, ArithmeticExpression> {
	
	public AssignmentOperation(Function leftChild, ArithmeticExpression rightChild) {
		super(leftChild, rightChild);
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(!requireDef.isEnabledConditionalEffects()) {
			throw new Exception("assignment operations are defined but :fluents is not required");
		}
	}

}

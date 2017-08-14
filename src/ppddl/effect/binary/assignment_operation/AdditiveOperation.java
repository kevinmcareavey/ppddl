package ppddl.effect.binary.assignment_operation;

import ppddl.ArithmeticExpression;
import ppddl.Requirements;
import ppddl.arithmetic_expression.Function;
import ppddl.effect.binary.AssignmentOperation;

public abstract class AdditiveOperation extends AssignmentOperation {

	public AdditiveOperation(ArithmeticExpression right) throws Exception {
		super(Function.REWARD, right);
		if(right.constainsReward()) {
			throw new Exception(Function.REWARD + " not permitted in update expression");
		}
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(!requireDef.isEnabledRewards()) {
			throw new Exception("additive operations are defined but :rewards is not required");
		}
	}

}

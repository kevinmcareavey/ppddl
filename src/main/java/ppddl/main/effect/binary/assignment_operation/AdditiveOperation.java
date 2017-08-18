package ppddl.main.effect.binary.assignment_operation;

import ppddl.exception.EffectException;
import ppddl.exception.RequirementsException;
import ppddl.main.ArithmeticExpression;
import ppddl.main.Requirements;
import ppddl.main.arithmetic_expression.Function;
import ppddl.main.effect.binary.AssignmentOperation;

public abstract class AdditiveOperation extends AssignmentOperation {

	public AdditiveOperation(ArithmeticExpression right) throws EffectException {
		super(Function.REWARD, right);
		if(right.constainsReward()) {
			throw new EffectException(Function.REWARD + " not permitted in update expression");
		}
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledRewards()) {
			throw new RequirementsException("additive operations are defined but :rewards is not required");
		}
	}

}

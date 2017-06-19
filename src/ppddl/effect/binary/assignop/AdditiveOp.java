package ppddl.effect.binary.assignop;

import ppddl.ArithmeticExpression;
import ppddl.arithmeticexpression.Function;
import ppddl.effect.binary.AssignOp;

public abstract class AdditiveOp extends AssignOp {

	public AdditiveOp(ArithmeticExpression right) {
		super(Function.REWARD, right);
	}

}

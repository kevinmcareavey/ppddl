package ppddl.action.effect.peffect.operation.assignop;

import ppddl.action.FExp;
import ppddl.action.Term;
import ppddl.action.effect.peffect.operation.AssignOp;
import ppddl.action.fexp.FHead;
import ppddl.domain.FunctionSymbol;

public abstract class AdditiveOp extends AssignOp {
	
	public static final FHead<Term> REWARD = new FHead<Term>(new FunctionSymbol("reward"));

	public AdditiveOp(FExp right) {
		super(AdditiveOp.REWARD, right);
	}

}

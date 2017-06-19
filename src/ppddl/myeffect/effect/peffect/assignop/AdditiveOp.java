package ppddl.myeffect.effect.peffect.assignop;

import ppddl.FExp;
import ppddl.fexp.FHead;
import ppddl.myeffect.effect.peffect.AssignOp;

public abstract class AdditiveOp extends AssignOp {

	public AdditiveOp(FExp right) {
		super(FHead.REWARD, right);
	}

}

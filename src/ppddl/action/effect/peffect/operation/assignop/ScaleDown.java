package ppddl.action.effect.peffect.operation.assignop;

import ppddl.action.FExp;
import ppddl.action.Term;
import ppddl.action.effect.peffect.operation.AssignOp;
import ppddl.action.fexp.FHead;

public class ScaleDown extends AssignOp {
	
	public ScaleDown(FHead<Term> left, FExp right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "scale-down";
	}

}

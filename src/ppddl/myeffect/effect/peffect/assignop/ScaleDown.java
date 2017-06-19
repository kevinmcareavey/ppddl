package ppddl.myeffect.effect.peffect.assignop;

import ppddl.FExp;
import ppddl.Term;
import ppddl.fexp.FHead;
import ppddl.myeffect.effect.peffect.AssignOp;

public class ScaleDown extends AssignOp {
	
	public ScaleDown(FHead<Term> left, FExp right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "scale-down";
	}

}

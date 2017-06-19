package ppddl.myeffect.effect.peffect.assignop;

import ppddl.FExp;
import ppddl.Term;
import ppddl.fexp.FHead;
import ppddl.myeffect.effect.peffect.AssignOp;

public class Assign extends AssignOp {

	public Assign(FHead<Term> left, FExp right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "assign";
	}
	
}

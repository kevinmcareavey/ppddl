package ppddl.action.effect.peffect.operation;

import ppddl.action.FExp;
import ppddl.action.Term;
import ppddl.action.effect.peffect.Operation;
import ppddl.action.fexp.FHead;

public abstract class AssignOp extends Operation {

	public AssignOp(FHead<Term> left, FExp right) {
		super(left, right);
	}

}

package ppddl.myeffect.effect.peffect.assignop;

import ppddl.FExp;
import ppddl.fexp.Function;
import ppddl.myeffect.effect.peffect.AssignOp;

public class ScaleDown extends AssignOp {
	
	public ScaleDown(Function left, FExp right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "scale-down";
	}

}
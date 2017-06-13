package ppddl.action.effect.peffect.operation.assignop.additiveop;

import ppddl.action.FExp;
import ppddl.action.effect.peffect.operation.assignop.AdditiveOp;

public class Increase extends AdditiveOp {
	
	public Increase(FExp right) {
		super(right);
	}

	@Override
	public String getSymbol() {
		return "increase";
	}

}

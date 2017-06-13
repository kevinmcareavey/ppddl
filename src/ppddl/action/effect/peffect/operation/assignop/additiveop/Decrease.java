package ppddl.action.effect.peffect.operation.assignop.additiveop;

import ppddl.action.FExp;
import ppddl.action.effect.peffect.operation.assignop.AdditiveOp;

public class Decrease extends AdditiveOp {

	public Decrease(FExp right) {
		super(right);
	}

	@Override
	public String getSymbol() {
		return "decrease";
	}

}

package ppddl.myeffect.effect.peffect.assignop.additiveop;

import ppddl.FExp;
import ppddl.myeffect.effect.peffect.assignop.AdditiveOp;

public class Decrease extends AdditiveOp {

	public Decrease(FExp right) {
		super(right);
	}

	@Override
	public String getSymbol() {
		return "decrease";
	}

}

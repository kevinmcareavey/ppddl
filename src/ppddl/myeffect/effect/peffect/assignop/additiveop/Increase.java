package ppddl.myeffect.effect.peffect.assignop.additiveop;

import ppddl.FExp;
import ppddl.myeffect.effect.peffect.assignop.AdditiveOp;

public class Increase extends AdditiveOp {
	
	public Increase(FExp right) {
		super(right);
	}

	@Override
	public String getSymbol() {
		return "increase";
	}

}

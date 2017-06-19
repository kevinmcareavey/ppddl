package ppddl.effect.binary.assignop.additiveop;

import ppddl.ArithmeticExpression;
import ppddl.effect.binary.assignop.AdditiveOp;

public class Increase extends AdditiveOp {
	
	public Increase(ArithmeticExpression right) {
		super(right);
	}

	@Override
	public String getSymbol() {
		return "increase";
	}

}

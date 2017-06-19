package ppddl.effect.binary.assignop.additiveop;

import ppddl.ArithmeticExpression;
import ppddl.effect.binary.assignop.AdditiveOp;

public class Decrease extends AdditiveOp {

	public Decrease(ArithmeticExpression right) {
		super(right);
	}

	@Override
	public String getSymbol() {
		return "decrease";
	}

}

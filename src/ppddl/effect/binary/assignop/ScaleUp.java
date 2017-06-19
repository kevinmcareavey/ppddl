package ppddl.effect.binary.assignop;

import ppddl.ArithmeticExpression;
import ppddl.arithmeticexpression.Function;
import ppddl.effect.binary.AssignOp;

public class ScaleUp extends AssignOp {
	
	public ScaleUp(Function left, ArithmeticExpression right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "scale-up";
	}

}

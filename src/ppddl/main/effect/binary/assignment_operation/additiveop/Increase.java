package ppddl.main.effect.binary.assignment_operation.additiveop;

import ppddl.exception.EffectException;
import ppddl.main.ArithmeticExpression;
import ppddl.main.effect.binary.assignment_operation.AdditiveOperation;

public class Increase extends AdditiveOperation {
	
	public Increase(ArithmeticExpression right) throws EffectException {
		super(right);
	}

	@Override
	public String getSymbol() {
		return "increase";
	}

}

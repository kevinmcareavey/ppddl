package ppddl.main.effect.binary.assignment_operation.additiveop;

import ppddl.exception.EffectException;
import ppddl.main.ArithmeticExpression;
import ppddl.main.effect.binary.assignment_operation.AdditiveOperation;

public class Decrease extends AdditiveOperation {

	public Decrease(ArithmeticExpression right) throws EffectException {
		super(right);
	}

	@Override
	public String getSymbol() {
		return "decrease";
	}

}

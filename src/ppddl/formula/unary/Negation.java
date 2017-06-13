package ppddl.formula.unary;

import ppddl.formula.Unary;

public class Negation<T> extends Unary<T> {

	public Negation(T child) {
		super(child);
	}

	@Override
	public String getSymbol() {
		return "not";
	}

}

package ppddl.precondition.unary;

import ppddl.Precondition;
import ppddl.precondition.UnaryPrecondition;

public class Negation extends UnaryPrecondition<Precondition> {

	public Negation(Precondition child) {
		super(child);
	}

	@Override
	public String getSymbol() {
		return "not";
	}

}

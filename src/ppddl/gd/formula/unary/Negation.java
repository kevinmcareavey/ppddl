package ppddl.gd.formula.unary;

import ppddl.GD;
import ppddl.gd.formula.Unary;

public class Negation extends Unary<GD> {

	public Negation(GD child) {
		super(child);
	}

	@Override
	public String getSymbol() {
		return "not";
	}

}

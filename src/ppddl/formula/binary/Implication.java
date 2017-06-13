package ppddl.formula.binary;

import ppddl.action.GD;
import ppddl.formula.Binary;

public class Implication extends Binary<GD, GD> {

	public Implication(GD left, GD right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "imply";
	}

}

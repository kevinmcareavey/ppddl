package ppddl.gd.formula.binary;

import ppddl.GD;
import ppddl.gd.formula.Binary;

public class Implication extends Binary<GD, GD> {

	public Implication(GD left, GD right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "imply";
	}

}

package ppddl.formula.binary;

import ppddl.action.Effect;
import ppddl.action.GD;
import ppddl.formula.Binary;

public class Conditional extends Binary<GD, Effect> {

	public Conditional(GD left, Effect right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "when";
	}

}

package ppddl.myeffect.effect.formula.binary;

import ppddl.GD;
import ppddl.myeffect.Effect;
import ppddl.myeffect.effect.formula.Binary;

public class Conditional extends Binary<GD> {

	public Conditional(GD leftChild, Effect rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "when";
	}

}

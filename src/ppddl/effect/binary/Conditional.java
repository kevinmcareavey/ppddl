package ppddl.effect.binary;

import ppddl.Effect;
import ppddl.Precondition;
import ppddl.effect.BinaryEffect;

public class Conditional extends BinaryEffect<Precondition, Effect> {

	public Conditional(Precondition leftChild, Effect rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "when";
	}

}

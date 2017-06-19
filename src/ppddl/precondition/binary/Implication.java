package ppddl.precondition.binary;

import ppddl.Precondition;
import ppddl.precondition.BinaryPrecondition;

public class Implication extends BinaryPrecondition<Precondition, Precondition> {

	public Implication(Precondition left, Precondition right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "imply";
	}

}

package ppddl.main.precondition.binary;

import ppddl.main.Precondition;
import ppddl.main.TypedList;
import ppddl.main.precondition.BinaryPrecondition;
import ppddl.main.term.Variable;

public abstract class QuantifiedPrecondition extends BinaryPrecondition<TypedList<Variable>, Precondition> {

	public QuantifiedPrecondition(TypedList<Variable> left, Precondition right) {
		super(left, right);
	}

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " (" + this.getLeftChild().toString() + ") " + this.getRightChild().toString() + ")";
	}
	
}

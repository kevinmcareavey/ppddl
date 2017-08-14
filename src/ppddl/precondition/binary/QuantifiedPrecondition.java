package ppddl.precondition.binary;

import ppddl.Precondition;
import ppddl.TypedList;
import ppddl.precondition.BinaryPrecondition;
import ppddl.term.Variable;

public abstract class QuantifiedPrecondition extends BinaryPrecondition<TypedList<Variable>, Precondition> {

	public QuantifiedPrecondition(TypedList<Variable> left, Precondition right) {
		super(left, right);
	}

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " (" + this.getLeftChild().toString() + ") " + this.getRightChild().toString() + ")";
	}
	
}

package ppddl.precondition.binary;

import ppddl.Precondition;
import ppddl.TypedList;
import ppddl.precondition.BinaryPrecondition;
import ppddl.term.Variable;

public abstract class Quantified extends BinaryPrecondition<TypedList<Variable>, Precondition> {

	public Quantified(TypedList<Variable> left, Precondition right) {
		super(left, right);
	}

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " (" + this.getLeftChild().toString() + ") " + this.getRightChild().toString() + ")";
	}
	
}

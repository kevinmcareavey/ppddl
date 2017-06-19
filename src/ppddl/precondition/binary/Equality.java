package ppddl.precondition.binary;

import ppddl.Term;
import ppddl.precondition.BinaryPrecondition;

public class Equality extends BinaryPrecondition<Term, Term> {

	public Equality(Term leftChild, Term rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "=";
	}

}

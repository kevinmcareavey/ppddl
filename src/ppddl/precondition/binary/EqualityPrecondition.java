package ppddl.precondition.binary;

import ppddl.Requirements;
import ppddl.Term;
import ppddl.precondition.BinaryPrecondition;

public class EqualityPrecondition extends BinaryPrecondition<Term, Term> {

	public EqualityPrecondition(Term leftChild, Term rightChild) {
		super(leftChild, rightChild);
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(!requireDef.isEnabledEquality()) {
			throw new Exception("equalities are defined but :equality is not required");
		}
	}

	@Override
	public String getSymbol() {
		return "=";
	}

}

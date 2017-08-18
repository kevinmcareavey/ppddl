package ppddl.main.precondition.binary;

import ppddl.exception.RequirementsException;
import ppddl.main.Requirements;
import ppddl.main.Term;
import ppddl.main.precondition.BinaryPrecondition;

public class EqualityPrecondition extends BinaryPrecondition<Term, Term> {

	public EqualityPrecondition(Term leftChild, Term rightChild) {
		super(leftChild, rightChild);
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledEquality()) {
			throw new RequirementsException("equalities are defined but :equality is not required");
		}
	}

	@Override
	public String getSymbol() {
		return "=";
	}

}

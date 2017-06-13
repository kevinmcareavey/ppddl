package ppddl.formula.binary;

import ppddl.action.Term;
import ppddl.formula.Binary;

public class Equality extends Binary<Term, Term> {

	public Equality(Term left, Term right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "=";
	}

}

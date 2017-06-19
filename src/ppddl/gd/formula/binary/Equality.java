package ppddl.gd.formula.binary;

import ppddl.Term;
import ppddl.gd.formula.Binary;

public class Equality extends Binary<Term, Term> {

	public Equality(Term left, Term right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "=";
	}

}

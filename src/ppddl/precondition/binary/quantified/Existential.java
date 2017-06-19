package ppddl.precondition.binary.quantified;

import ppddl.Precondition;
import ppddl.TypedList;
import ppddl.precondition.binary.Quantified;
import ppddl.term.Variable;

public class Existential extends Quantified {

	public Existential(TypedList<Variable> left, Precondition right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "exists";
	}

}

package ppddl.precondition.binary.quantified;

import ppddl.Precondition;
import ppddl.TypedList;
import ppddl.precondition.binary.Quantified;
import ppddl.term.Variable;

public class Universal extends Quantified {

	public Universal(TypedList<Variable> left, Precondition right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "forall";
	}

}

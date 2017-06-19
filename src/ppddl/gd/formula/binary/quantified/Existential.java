package ppddl.gd.formula.binary.quantified;

import ppddl.GD;
import ppddl.TypedList;
import ppddl.gd.formula.binary.Quantified;
import ppddl.term.Variable;

public class Existential extends Quantified {

	public Existential(TypedList<Variable> left, GD right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "exists";
	}

}

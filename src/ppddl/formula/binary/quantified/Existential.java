package ppddl.formula.binary.quantified;

import ppddl.action.Variable;
import ppddl.domain.TypedList;
import ppddl.formula.binary.Quantified;

public class Existential<T> extends Quantified<T> {

	public Existential(TypedList<Variable> left, T right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "exists";
	}

}

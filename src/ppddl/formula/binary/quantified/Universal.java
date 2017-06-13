package ppddl.formula.binary.quantified;

import ppddl.action.Variable;
import ppddl.domain.TypedList;
import ppddl.formula.binary.Quantified;

public class Universal<T> extends Quantified<T> {

	public Universal(TypedList<Variable> left, T right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "forall";
	}

}

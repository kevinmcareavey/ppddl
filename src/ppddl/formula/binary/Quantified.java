package ppddl.formula.binary;

import ppddl.action.Variable;
import ppddl.domain.TypedList;
import ppddl.formula.Binary;

public abstract class Quantified<T> extends Binary<TypedList<Variable>, T> {

	public Quantified(TypedList<Variable> left, T right) {
		super(left, right);
	}

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " (" + this.getLeft().toString() + ") " + this.getRight().toString() + ")";
	}
	
}

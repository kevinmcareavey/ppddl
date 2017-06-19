package ppddl.gd.formula.binary;

import ppddl.GD;
import ppddl.TypedList;
import ppddl.gd.formula.Binary;
import ppddl.term.Variable;

public abstract class Quantified extends Binary<TypedList<Variable>, GD> {

	public Quantified(TypedList<Variable> left, GD right) {
		super(left, right);
	}

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " (" + this.getLeftChild().toString() + ") " + this.getRightChild().toString() + ")";
	}
	
}

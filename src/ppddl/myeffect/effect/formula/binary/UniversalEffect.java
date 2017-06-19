package ppddl.myeffect.effect.formula.binary;

import ppddl.TypedList;
import ppddl.myeffect.Effect;
import ppddl.myeffect.effect.formula.Binary;
import ppddl.term.Variable;

public class UniversalEffect extends Binary<TypedList<Variable>> {

	public UniversalEffect(TypedList<Variable> leftChild, Effect rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "forall";
	}

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " (" + this.getLeftChild().toString() + ") " + this.getRightChild().toString() + ")";
	}

}

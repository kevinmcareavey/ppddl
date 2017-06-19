package ppddl.effect.binary;

import ppddl.Effect;
import ppddl.TypedList;
import ppddl.effect.BinaryEffect;
import ppddl.term.Variable;

public class UniversalEffect extends BinaryEffect<TypedList<Variable>, Effect> {

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

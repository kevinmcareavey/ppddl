package ppddl.effect.binary;

import ppddl.Effect;
import ppddl.Requirements;
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
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(!requireDef.isEnabledConditionalEffects()) {
			throw new Exception("universal effects are defined but :conditional-effects is not required");
		}
		this.getLeftChild().validate(requireDef);
		this.getRightChild().validate(requireDef);
	}

}

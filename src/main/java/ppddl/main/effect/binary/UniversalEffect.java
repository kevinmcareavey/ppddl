package ppddl.main.effect.binary;

import ppddl.exception.RequirementsException;
import ppddl.main.Effect;
import ppddl.main.Requirements;
import ppddl.main.TypedList;
import ppddl.main.effect.BinaryEffect;
import ppddl.main.term.Variable;

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
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledConditionalEffects()) {
			throw new RequirementsException("universal effects are defined but :conditional-effects is not required");
		}
		this.getLeftChild().validate(requireDef);
		this.getRightChild().validate(requireDef);
	}

}

package ppddl.main.effect.binary;

import ppddl.exception.RequirementsException;
import ppddl.main.Effect;
import ppddl.main.Precondition;
import ppddl.main.Requirements;
import ppddl.main.effect.BinaryEffect;

public class ConditionalEffect extends BinaryEffect<Precondition, Effect> {

	public ConditionalEffect(Precondition leftChild, Effect rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "when";
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledConditionalEffects()) {
			throw new RequirementsException("conditional effects are defined but :conditional-effects is not required");
		}
		this.getLeftChild().validate(requireDef);
		this.getRightChild().validate(requireDef);
	}

}

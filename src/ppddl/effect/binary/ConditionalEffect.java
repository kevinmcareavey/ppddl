package ppddl.effect.binary;

import ppddl.Effect;
import ppddl.Precondition;
import ppddl.Requirements;
import ppddl.effect.BinaryEffect;

public class ConditionalEffect extends BinaryEffect<Precondition, Effect> {

	public ConditionalEffect(Precondition leftChild, Effect rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "when";
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(!requireDef.isEnabledConditionalEffects()) {
			throw new Exception("conditional effects are defined but :conditional-effects is not required");
		}
		this.getLeftChild().validate(requireDef);
		this.getRightChild().validate(requireDef);
	}

}

package ppddl.precondition.binary;

import ppddl.Precondition;
import ppddl.Requirements;
import ppddl.precondition.BinaryPrecondition;

public class ImplicationPrecondition extends BinaryPrecondition<Precondition, Precondition> {

	public ImplicationPrecondition(Precondition left, Precondition right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "imply";
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(!requireDef.isEnabledDisjunctivePreconditions()) {
			throw new Exception("implications are defined but :disjunctive-preconditions is not required");
		}
		this.getLeftChild().validate(requireDef);
		this.getRightChild().validate(requireDef);
	}

}

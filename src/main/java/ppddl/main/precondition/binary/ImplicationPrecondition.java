package ppddl.main.precondition.binary;

import ppddl.exception.RequirementsException;
import ppddl.main.Precondition;
import ppddl.main.Requirements;
import ppddl.main.precondition.BinaryPrecondition;

public class ImplicationPrecondition extends BinaryPrecondition<Precondition, Precondition> {

	public ImplicationPrecondition(Precondition left, Precondition right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "imply";
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledDisjunctivePreconditions()) {
			throw new RequirementsException("implications are defined but :disjunctive-preconditions is not required");
		}
		this.getLeftChild().validate(requireDef);
		this.getRightChild().validate(requireDef);
	}

}

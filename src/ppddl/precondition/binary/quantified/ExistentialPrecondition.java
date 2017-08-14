package ppddl.precondition.binary.quantified;

import ppddl.Precondition;
import ppddl.Requirements;
import ppddl.TypedList;
import ppddl.precondition.binary.QuantifiedPrecondition;
import ppddl.term.Variable;

public class ExistentialPrecondition extends QuantifiedPrecondition {

	public ExistentialPrecondition(TypedList<Variable> left, Precondition right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "exists";
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(!requireDef.isEnabledEquality()) {
			throw new Exception("existential preconditions are defined but :existential-preconditions is not required");
		}
		this.getLeftChild().validate(requireDef);
		this.getRightChild().validate(requireDef);
	}

}

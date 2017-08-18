package ppddl.main.precondition.binary.quantified;

import ppddl.exception.RequirementsException;
import ppddl.main.Precondition;
import ppddl.main.Requirements;
import ppddl.main.TypedList;
import ppddl.main.precondition.binary.QuantifiedPrecondition;
import ppddl.main.term.Variable;

public class ExistentialPrecondition extends QuantifiedPrecondition {

	public ExistentialPrecondition(TypedList<Variable> left, Precondition right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "exists";
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledEquality()) {
			throw new RequirementsException("existential preconditions are defined but :existential-preconditions is not required");
		}
		this.getLeftChild().validate(requireDef);
		this.getRightChild().validate(requireDef);
	}

}

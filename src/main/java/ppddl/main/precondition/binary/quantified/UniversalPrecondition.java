package ppddl.main.precondition.binary.quantified;

import ppddl.exception.RequirementsException;
import ppddl.main.Precondition;
import ppddl.main.Requirements;
import ppddl.main.TypedList;
import ppddl.main.precondition.binary.QuantifiedPrecondition;
import ppddl.main.term.Variable;

public class UniversalPrecondition extends QuantifiedPrecondition {

	public UniversalPrecondition(TypedList<Variable> left, Precondition right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "forall";
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledUniversalPreconditions()) {
			throw new RequirementsException("universal preconditions are defined but :universal-preconditions is not required");
		}
		this.getLeftChild().validate(requireDef);
		this.getRightChild().validate(requireDef);
	}

}

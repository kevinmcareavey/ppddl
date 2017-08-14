package ppddl.precondition.binary.quantified;

import ppddl.Precondition;
import ppddl.Requirements;
import ppddl.TypedList;
import ppddl.precondition.binary.QuantifiedPrecondition;
import ppddl.term.Variable;

public class UniversalPrecondition extends QuantifiedPrecondition {

	public UniversalPrecondition(TypedList<Variable> left, Precondition right) {
		super(left, right);
	}

	@Override
	public String getSymbol() {
		return "forall";
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(!requireDef.isEnabledUniversalPreconditions()) {
			throw new Exception("universal preconditions are defined but :universal-preconditions is not required");
		}
		this.getLeftChild().validate(requireDef);
		this.getRightChild().validate(requireDef);
	}

}

package ppddl.main.precondition.unary;

import ppddl.exception.RequirementsException;
import ppddl.main.Precondition;
import ppddl.main.Requirements;
import ppddl.main.precondition.UnaryPrecondition;
import ppddl.main.precondition.binary.EqualityPrecondition;

public class NegationPrecondition extends UnaryPrecondition<Precondition> {

	public NegationPrecondition(Precondition child) {
		super(child);
	}

	@Override
	public String getSymbol() {
		return "not";
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		if(this.getChild() instanceof EqualityPrecondition) {
			((EqualityPrecondition)this.getChild()).validate(requireDef);
		} else if(this.getChild() instanceof AtomicPrecondition) {
			((AtomicPrecondition)this.getChild()).validate(requireDef);
		} else if(!requireDef.isEnabledDisjunctivePreconditions()) {
			throw new RequirementsException("arbitrary negations are defined but :disjunctive-preconditions is not required");
		} else {
			this.getChild().validate(requireDef);
		}
	}

}

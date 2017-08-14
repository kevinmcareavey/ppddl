package ppddl.precondition.unary;

import ppddl.Precondition;
import ppddl.Requirements;
import ppddl.precondition.UnaryPrecondition;
import ppddl.precondition.binary.EqualityPrecondition;

public class NegationPrecondition extends UnaryPrecondition<Precondition> {

	public NegationPrecondition(Precondition child) {
		super(child);
	}

	@Override
	public String getSymbol() {
		return "not";
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(this.getChild() instanceof EqualityPrecondition) {
			((EqualityPrecondition)this.getChild()).validate(requireDef);
		} else if(this.getChild() instanceof AtomicPrecondition) {
			((AtomicPrecondition)this.getChild()).validate(requireDef);
		} else if(!requireDef.isEnabledDisjunctivePreconditions()) {
			throw new Exception("arbitrary negations are defined but :disjunctive-preconditions is not required");
		} else {
			this.getChild().validate(requireDef);
		}
	}

}

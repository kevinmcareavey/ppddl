package ppddl.precondition.nary;

import java.util.List;

import ppddl.Precondition;
import ppddl.Requirements;
import ppddl.precondition.NaryPrecondition;

public class DisjunctionPrecondition extends NaryPrecondition<Precondition> {
	
	public DisjunctionPrecondition(List<Precondition> arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("disjunctions need at least two children");
		}
	}
	
	public DisjunctionPrecondition(Precondition... arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("disjunctions need at least two children");
		}
	}

	@Override
	public String getSymbol() {
		return "or";
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(!requireDef.isEnabledDisjunctivePreconditions()) {
			throw new Exception("disjunctive preconditions are defined but :disjunctive-preconditions is not required");
		}
		for(Precondition precondition : this.getChildren()) {
			precondition.validate(requireDef);
		}
	}

}

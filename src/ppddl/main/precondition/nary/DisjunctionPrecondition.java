package ppddl.main.precondition.nary;

import java.util.List;

import ppddl.exception.PreconditionException;
import ppddl.exception.RequirementsException;
import ppddl.main.Precondition;
import ppddl.main.Requirements;
import ppddl.main.precondition.NaryPrecondition;

public class DisjunctionPrecondition extends NaryPrecondition<Precondition> {
	
	public DisjunctionPrecondition(List<Precondition> arguments) throws PreconditionException {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new PreconditionException("disjunctions need at least two children");
		}
	}
	
	public DisjunctionPrecondition(Precondition... arguments) throws PreconditionException {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new PreconditionException("disjunctions need at least two children");
		}
	}

	@Override
	public String getSymbol() {
		return "or";
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledDisjunctivePreconditions()) {
			throw new RequirementsException("disjunctive preconditions are defined but :disjunctive-preconditions is not required");
		}
		for(Precondition precondition : this.getChildren()) {
			precondition.validate(requireDef);
		}
	}

}

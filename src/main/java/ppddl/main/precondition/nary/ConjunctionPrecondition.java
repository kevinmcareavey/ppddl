package ppddl.main.precondition.nary;

import java.util.List;

import ppddl.exception.PreconditionException;
import ppddl.exception.RequirementsException;
import ppddl.main.Precondition;
import ppddl.main.Requirements;
import ppddl.main.precondition.NaryPrecondition;

public class ConjunctionPrecondition extends NaryPrecondition<Precondition> {
	
	public ConjunctionPrecondition(List<Precondition> arguments) throws PreconditionException {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new PreconditionException("conjunctions need at least two children");
		}
	}
	
	public ConjunctionPrecondition(Precondition... arguments) throws PreconditionException {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new PreconditionException("conjunctions need at least two children");
		}
	}

	@Override
	public String getSymbol() {
		return "and";
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		for(Precondition precondition : this.getChildren()) {
			precondition.validate(requireDef);
		}
	}

}

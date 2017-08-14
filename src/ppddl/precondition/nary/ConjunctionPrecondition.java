package ppddl.precondition.nary;

import java.util.List;

import ppddl.Precondition;
import ppddl.Requirements;
import ppddl.precondition.NaryPrecondition;

public class ConjunctionPrecondition extends NaryPrecondition<Precondition> {
	
	public ConjunctionPrecondition(List<Precondition> arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("conjunctions need at least two children");
		}
	}
	
	public ConjunctionPrecondition(Precondition... arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("conjunctions need at least two children");
		}
	}

	@Override
	public String getSymbol() {
		return "and";
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		for(Precondition precondition : this.getChildren()) {
			precondition.validate(requireDef);
		}
	}

}

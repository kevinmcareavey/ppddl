package ppddl.precondition.nary;

import java.util.List;

import ppddl.Precondition;
import ppddl.precondition.NaryPrecondition;

public class Disjunction extends NaryPrecondition<Precondition> {
	
	public Disjunction(List<Precondition> arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("disjunctions need at least two children");
		}
	}
	
	public Disjunction(Precondition... arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("disjunctions need at least two children");
		}
	}

	@Override
	public String getSymbol() {
		return "or";
	}

}

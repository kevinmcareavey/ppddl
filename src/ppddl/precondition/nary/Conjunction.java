package ppddl.precondition.nary;

import java.util.List;

import ppddl.Precondition;
import ppddl.precondition.NaryPrecondition;

public class Conjunction extends NaryPrecondition<Precondition> {
	
	public Conjunction(List<Precondition> arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("conjunctions need at least two children");
		}
	}
	
	public Conjunction(Precondition... arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("conjunctions need at least two children");
		}
	}

	@Override
	public String getSymbol() {
		return "and";
	}

}

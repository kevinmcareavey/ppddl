package ppddl.gd.formula.nary;

import java.util.List;

import ppddl.GD;
import ppddl.gd.formula.Nary;

public class Disjunction extends Nary<GD> {
	
	public Disjunction(List<GD> arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("disjunctions need at least two children");
		}
	}
	
	public Disjunction(GD... arguments) throws Exception {
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

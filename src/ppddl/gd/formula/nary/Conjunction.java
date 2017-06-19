package ppddl.gd.formula.nary;

import java.util.List;

import ppddl.GD;
import ppddl.gd.formula.Nary;

public class Conjunction extends Nary<GD> {
	
	public Conjunction(List<GD> arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("conjunctions need at least two children");
		}
	}
	
	public Conjunction(GD... arguments) throws Exception {
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

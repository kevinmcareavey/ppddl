package ppddl.myeffect.effect.formula.nary;

import java.util.List;

import ppddl.myeffect.Effect;
import ppddl.myeffect.effect.formula.Nary;

public class ConjunctiveEffect extends Nary<Effect> {

	public ConjunctiveEffect(List<Effect> arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("conjunctive effects need at least two children");
		}
	}
	
	public ConjunctiveEffect(Effect... arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("conjunctive effects need at least two children");
		}
	}

	@Override
	public String getSymbol() {
		return "and";
	}

}

package ppddl.effect.nary;

import java.util.List;

import ppddl.Effect;
import ppddl.effect.NaryEffect;

public class ConjunctiveEffect extends NaryEffect<Effect> {

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

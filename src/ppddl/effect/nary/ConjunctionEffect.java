package ppddl.effect.nary;

import java.util.List;

import ppddl.Effect;
import ppddl.Requirements;
import ppddl.effect.NaryEffect;

public class ConjunctionEffect extends NaryEffect<Effect> {

	public ConjunctionEffect(List<Effect> arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("conjunctive effects need at least two children");
		}
	}
	
	public ConjunctionEffect(Effect... arguments) throws Exception {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new Exception("conjunctive effects need at least two children");
		}
	}

	@Override
	public String getSymbol() {
		return "and";
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		for(Effect effect : this.getChildren()) {
			effect.validate(requireDef);
		}
	}

}

package ppddl.main.effect.nary;

import java.util.List;

import ppddl.exception.EffectException;
import ppddl.exception.RequirementsException;
import ppddl.main.Effect;
import ppddl.main.Requirements;
import ppddl.main.effect.NaryEffect;

public class ConjunctionEffect extends NaryEffect<Effect> {

	public ConjunctionEffect(List<Effect> arguments) throws EffectException {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new EffectException("conjunctive effects need at least two children");
		}
	}
	
	public ConjunctionEffect(Effect... arguments) throws EffectException {
		super(arguments);
		if(this.getChildren().size() < 2) {
			throw new EffectException("conjunctive effects need at least two children");
		}
	}

	@Override
	public String getSymbol() {
		return "and";
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		for(Effect effect : this.getChildren()) {
			effect.validate(requireDef);
		}
	}

}

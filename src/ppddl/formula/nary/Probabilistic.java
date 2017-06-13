package ppddl.formula.nary;

import java.util.List;

import ppddl.action.effect.ProbEffect;
import ppddl.formula.Nary;

public class Probabilistic extends Nary<ProbEffect> {
	
	public Probabilistic(List<ProbEffect> arguments) {
		super(arguments);
	}

	@Override
	public String getSymbol() {
		return "probabilistic";
	}

}

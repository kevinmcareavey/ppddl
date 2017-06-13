package ppddl.formula.nary;

import java.util.List;

import ppddl.formula.Nary;

public class Disjunction<T> extends Nary<T> {
	
	public Disjunction(List<T> arguments) {
		super(arguments);
	}

	@Override
	public String getSymbol() {
		return "or";
	}

}

package ppddl.formula.nary;

import java.util.List;

import ppddl.formula.Nary;

public class Conjunction<T> extends Nary<T> {
	
	public Conjunction(List<T> arguments) {
		super(arguments);
	}

	@Override
	public String getSymbol() {
		return "and";
	}

}

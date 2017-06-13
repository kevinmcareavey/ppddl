package ppddl.action.fexp;

import ppddl.action.FExp;

public class Negative extends FExp {
	
	private FExp child;

	@Override
	public String toString() {
		return "(-" + child + ")";
	}
	
}

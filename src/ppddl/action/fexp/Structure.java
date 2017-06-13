package ppddl.action.fexp;

import ppddl.action.BinaryOp;
import ppddl.action.FExp;

public class Structure extends FExp {
	
	private BinaryOp binaryOp;
	private FExp left;
	private FExp right;
	
	@Override
	public String toString() {
		return "(" + binaryOp.toString() + " " + left.toString() + " " + right.toString() + ")";
	}
	
}

package ppddl.fexp.binaryop;

import ppddl.FExp;
import ppddl.fexp.BinaryOp;

public class Addition extends BinaryOp {

	public Addition(FExp leftChild, FExp rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "+";
	}

}

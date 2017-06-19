package ppddl.fexp.binaryop;

import ppddl.FExp;
import ppddl.fexp.BinaryOp;

public class Division extends BinaryOp {
	
	public Division(FExp leftChild, FExp rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "/";
	}
	
}

package ppddl.fexp.binaryop;

import ppddl.FExp;
import ppddl.fexp.BinaryOp;

public class Subtraction extends BinaryOp {
	
	public Subtraction(FExp leftChild, FExp rightChild) {
		super(leftChild, rightChild);
	}
	
	@Override
	public String getSymbol() {
		return "-";
	}

}

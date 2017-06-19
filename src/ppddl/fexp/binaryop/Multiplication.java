package ppddl.fexp.binaryop;

import ppddl.FExp;
import ppddl.fexp.BinaryOp;

public class Multiplication extends BinaryOp {
	
	public Multiplication(FExp leftChild, FExp rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "*";
	}

}

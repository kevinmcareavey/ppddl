package ppddl.initel.ainitel.pinitel.binary;

import ppddl.arithmeticexpression.Function;
import ppddl.arithmeticexpression.MyNumber;
import ppddl.initel.ainitel.pinitel.BinaryPInitEl;

public class EQInitial extends BinaryPInitEl<Function, MyNumber> {
	
	public EQInitial(Function leftChild, MyNumber rightChild) {
		super(leftChild, rightChild);
	}
	
	@Override
	public String getSymbol() {
		return "=";
	}

}

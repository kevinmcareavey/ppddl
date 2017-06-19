package ppddl.gd.fcomp;

import ppddl.FExp;
import ppddl.gd.FComp;

public class GE extends FComp {
	
	public GE(FExp leftChild, FExp rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return ">=";
	}

}

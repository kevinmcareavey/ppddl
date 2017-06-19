package ppddl.gd.fcomp;

import ppddl.FExp;
import ppddl.gd.FComp;

public class LE extends FComp {
	
	public LE(FExp leftChild, FExp rightChild) {
		super(leftChild, rightChild);
	}
	
	@Override
	public String getSymbol() {
		return "<=";
	}

}

package ppddl.gd.fcomp;

import ppddl.FExp;
import ppddl.gd.FComp;

public class LT extends FComp {
	
	public LT(FExp leftChild, FExp rightChild) {
		super(leftChild, rightChild);
	}
	
	@Override
	public String getSymbol() {
		return "<";
	}

}

package ppddl.gd.fcomp;

import ppddl.FExp;
import ppddl.gd.FComp;

public class GT extends FComp {
	
	public GT(FExp leftChild, FExp rightChild) {
		super(leftChild, rightChild);
	}
	
	@Override
	public String getSymbol() {
		return ">";
	}

}
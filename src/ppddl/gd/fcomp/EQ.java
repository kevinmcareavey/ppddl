package ppddl.gd.fcomp;

import ppddl.FExp;
import ppddl.gd.FComp;

public class EQ extends FComp {

	public EQ(FExp leftChild, FExp rightChild) {
		super(leftChild, rightChild);
	}

	@Override
	public String getSymbol() {
		return "=";
	}

}

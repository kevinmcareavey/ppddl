package ppddl.initel.pinitel;

import ppddl.fexp.Function;
import ppddl.fexp.MyNumber;
import ppddl.gd.fcomp.EQ;
import ppddl.initel.PInitEl;

public class InitialFunction extends PInitEl {
	
	private EQ child;
	
	public InitialFunction(Function leftChild, MyNumber rightChild) {
		this.setChild(leftChild, rightChild);
	}

	public EQ getChild() {
		return child;
	}

	public void setChild(Function leftChild, MyNumber rightChild) {
		this.child = new EQ(leftChild, rightChild);
	}

	@Override
	public String toString() {
		return this.getChild().toString();
	}

}

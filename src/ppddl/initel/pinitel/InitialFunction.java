package ppddl.initel.pinitel;

import ppddl.fexp.FHead;
import ppddl.fexp.MyNumber;
import ppddl.gd.fcomp.EQ;
import ppddl.initel.PInitEl;
import ppddl.term.Constant;

public class InitialFunction extends PInitEl {
	
	private EQ child;
	
	public InitialFunction(FHead<Constant> leftChild, MyNumber rightChild) {
		this.setChild(leftChild, rightChild);
	}

	public EQ getChild() {
		return child;
	}

	public void setChild(FHead<Constant> leftChild, MyNumber rightChild) {
		this.child = new EQ(leftChild, rightChild);
	}

	@Override
	public String toString() {
		return this.getChild().toString();
	}

}

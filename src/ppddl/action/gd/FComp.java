package ppddl.action.gd;

import ppddl.action.BinaryComp;
import ppddl.action.FExp;
import ppddl.action.GD;

public class FComp extends GD {
	
	private BinaryComp binaryComp;
	private FExp left;
	private FExp right;
	
	public BinaryComp getBinaryComp() {
		return binaryComp;
	}
	
	public void setBinaryComp(BinaryComp binaryComp) {
		this.binaryComp = binaryComp;
	}
	
	public FExp getLeft() {
		return left;
	}
	
	public void setLeft(FExp left) {
		this.left = left;
	}
	
	public FExp getRight() {
		return right;
	}
	
	public void setRight(FExp right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "(" + binaryComp.toString() + " " + left.toString() + " " + right.toString() + ")";
	}
	
}

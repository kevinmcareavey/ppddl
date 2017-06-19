package ppddl.gd;

import ppddl.FExp;
import ppddl.GD;

public abstract class FComp extends GD {
	
	private FExp leftChild;
	private FExp rightChild;
	
	public FComp(FExp leftChild, FExp rightChild) {
		this.setLeftChild(leftChild);
		this.setRightChild(rightChild);
	}
	
	public FExp getLeftChild() {
		return leftChild;
	}
	
	public void setLeftChild(FExp leftChild) {
		this.leftChild = leftChild;
	}
	
	public FExp getRightChild() {
		return rightChild;
	}
	
	public void setRightChild(FExp rightChild) {
		this.rightChild = rightChild;
	}
	
	public abstract String getSymbol();

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " " + this.getLeftChild().toString() + " " + this.getRightChild().toString() + ")";
	}
	
}

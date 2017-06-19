package ppddl.fexp;

import ppddl.FExp;

public abstract class BinaryOp extends FExp {
	
	private FExp leftChild;
	private FExp rightChild;
	
	public BinaryOp(FExp leftChild, FExp rightChild) {
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

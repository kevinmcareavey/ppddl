package ppddl.gd.formula;

import ppddl.gd.Formula;

public abstract class Binary<T, U> extends Formula {
	
	private T leftChild;
	private U rightChild;
	
	public Binary(T leftChild, U rightChild) {
		this.setLeftChild(leftChild);
		this.setRightChild(rightChild);
	}
	
	public T getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(T leftChild) {
		this.leftChild = leftChild;
	}

	public U getRightChild() {
		return rightChild;
	}

	public void setRightChild(U rightChild) {
		this.rightChild = rightChild;
	}
	
	public abstract String getSymbol();

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " " + this.getLeftChild().toString() + " " + this.getRightChild().toString() + ")";
	}
	
}

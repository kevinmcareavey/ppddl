package ppddl.main.precondition;

import ppddl.main.Precondition;

public abstract class BinaryPrecondition<T, U> extends Precondition {
	
	private T leftChild;
	private U rightChild;
	
	public BinaryPrecondition(T leftChild, U rightChild) {
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

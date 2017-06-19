package ppddl.initel.ainitel.pinitel;

import ppddl.initel.ainitel.PInitEl;

public abstract class BinaryPInitEl<T, U> extends PInitEl {
	
	private T leftChild;
	private U rightChild;
	
	public BinaryPInitEl(T leftChild, U rightChild) {
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
		return "(" + this.getSymbol() + " " + this.getLeftChild() + " " + this.getRightChild() + ")";
	}

}

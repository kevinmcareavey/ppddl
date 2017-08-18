package ppddl.main.effect;

import ppddl.main.Effect;

public abstract class BinaryEffect<T, U> extends Effect {
	
	private T leftChild;
	private U rightChild;
	
	public BinaryEffect(T leftChild, U rightChild) {
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

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " " + this.getLeftChild().toString() + " " + this.getRightChild().toString() + ")";
	}
	
}

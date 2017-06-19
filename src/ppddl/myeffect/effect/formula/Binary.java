package ppddl.myeffect.effect.formula;

import ppddl.myeffect.Effect;
import ppddl.myeffect.effect.Formula;

public abstract class Binary<T> extends Formula {
	
	private T leftChild;
	private Effect rightChild;
	
	public Binary(T leftChild, Effect rightChild) {
		this.setLeftChild(leftChild);
		this.setRightChild(rightChild);
	}
	
	public T getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(T leftChild) {
		this.leftChild = leftChild;
	}

	public Effect getRightChild() {
		return rightChild;
	}

	public void setRightChild(Effect rightChild) {
		this.rightChild = rightChild;
	}
	
	public abstract String getSymbol();

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " " + this.getLeftChild().toString() + " " + this.getRightChild().toString() + ")";
	}
	
}

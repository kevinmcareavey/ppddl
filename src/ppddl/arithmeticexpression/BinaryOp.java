package ppddl.arithmeticexpression;

import ppddl.ArithmeticExpression;

public abstract class BinaryOp extends ArithmeticExpression {
	
	private ArithmeticExpression leftChild;
	private ArithmeticExpression rightChild;
	
	public BinaryOp(ArithmeticExpression leftChild, ArithmeticExpression rightChild) {
		this.setLeftChild(leftChild);
		this.setRightChild(rightChild);
	}
	
	public ArithmeticExpression getLeftChild() {
		return leftChild;
	}
	
	public void setLeftChild(ArithmeticExpression leftChild) {
		this.leftChild = leftChild;
	}
	
	public ArithmeticExpression getRightChild() {
		return rightChild;
	}
	
	public void setRightChild(ArithmeticExpression rightChild) {
		this.rightChild = rightChild;
	}
	
	public abstract String getSymbol();
	
	@Override
	public boolean isGround() {
		return this.getLeftChild().isGround() && this.getRightChild().isGround();
	}

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " " + this.getLeftChild().toString() + " " + this.getRightChild().toString() + ")";
	}
	
}

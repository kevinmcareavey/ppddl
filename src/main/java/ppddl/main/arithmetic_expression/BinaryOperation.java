package ppddl.main.arithmetic_expression;

import ppddl.exception.RequirementsException;
import ppddl.main.ArithmeticExpression;
import ppddl.main.Requirements;

public abstract class BinaryOperation extends ArithmeticExpression {
	
	private ArithmeticExpression leftChild;
	private ArithmeticExpression rightChild;
	
	public BinaryOperation(ArithmeticExpression leftChild, ArithmeticExpression rightChild) {
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
	public void validate(Requirements requireDef) throws RequirementsException {
		// Supported by default
	}
	
	@Override
	public boolean constainsReward() {
		return this.getLeftChild().constainsReward() || this.getRightChild().constainsReward();
	}

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " " + this.getLeftChild().toString() + " " + this.getRightChild().toString() + ")";
	}
	
}

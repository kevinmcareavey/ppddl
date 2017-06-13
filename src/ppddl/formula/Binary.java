package ppddl.formula;

import ppddl.Formula;

public abstract class Binary<T, U> extends Formula {
	
	private T left;
	private U right;
	
	public Binary(T left, U right) {
		this.setLeft(left);
		this.setRight(right);
	}
	
	public T getLeft() {
		return left;
	}

	public void setLeft(T left) {
		this.left = left;
	}

	public U getRight() {
		return right;
	}

	public void setRight(U right) {
		this.right = right;
	}
	
	public abstract String getSymbol();

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " " + left.toString() + " " + right.toString() + ")";
	}
	
}

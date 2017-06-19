package ppddl.myeffect.effect.peffect;

import ppddl.FExp;
import ppddl.fexp.Function;
import ppddl.myeffect.effect.PEffect;

public abstract class AssignOp extends PEffect {
	
	private Function left;
	private FExp right;
	
	public AssignOp(Function left, FExp right) {
		this.setLeft(left);
		this.setRight(right);
	}

	public Function getLeft() {
		return left;
	}

	public void setLeft(Function left) {
		this.left = left;
	}

	public FExp getRight() {
		return right;
	}

	public void setRight(FExp right) {
		this.right = right;
	}
	
	public abstract String getSymbol();

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " " + this.getLeft() + " " + this.getRight() + ")";
	}

}

package ppddl.myeffect.effect.peffect;

import ppddl.FExp;
import ppddl.Term;
import ppddl.fexp.FHead;
import ppddl.myeffect.effect.PEffect;

public abstract class AssignOp extends PEffect {
	
	private FHead<Term> left;
	private FExp right;
	
	public AssignOp(FHead<Term> left, FExp right) {
		this.setLeft(left);
		this.setRight(right);
	}

	public FHead<Term> getLeft() {
		return left;
	}

	public void setLeft(FHead<Term> left) {
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

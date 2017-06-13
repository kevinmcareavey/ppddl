package ppddl.action.effect.peffect;

import ppddl.action.FExp;
import ppddl.action.Term;
import ppddl.action.effect.PEffect;
import ppddl.action.fexp.FHead;

public abstract class Operation extends PEffect {
	
	private FHead<Term> left;
	private FExp right;
	
	public Operation(FHead<Term> left, FExp right) {
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

}

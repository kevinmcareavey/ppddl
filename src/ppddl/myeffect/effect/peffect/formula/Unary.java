package ppddl.myeffect.effect.peffect.formula;

import ppddl.AtomicFormula;
import ppddl.Term;
import ppddl.myeffect.effect.peffect.Formula;

public abstract class Unary extends Formula {
	
	private AtomicFormula<Term> child;
	
	public Unary(AtomicFormula<Term> child) {
		this.setChild(child);
	}
	
	public AtomicFormula<Term> getChild() {
		return child;
	}

	public void setChild(AtomicFormula<Term> child) {
		this.child = child;
	}
	
	public abstract String getSymbol();

	@Override
	public String toString() {
		return "(" + this.getSymbol() + " " + this.getChild() + ")";
	}

}

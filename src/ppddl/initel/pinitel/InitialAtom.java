package ppddl.initel.pinitel;

import ppddl.AtomicFormula;
import ppddl.Term;
import ppddl.initel.PInitEl;

public class InitialAtom extends PInitEl {
	
	private AtomicFormula<Term> child;
	
	public InitialAtom(AtomicFormula<Term> child) {
		this.setChild(child);
	}

	public AtomicFormula<Term> getChild() {
		return child;
	}

	public void setChild(AtomicFormula<Term> child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return this.getChild().toString();
	}

}

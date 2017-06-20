package ppddl.initformula.deterministic.terminal;

import ppddl.Atom;
import ppddl.initformula.deterministic.TerminalDeterministicInitFormula;

public class AtomicInitFormula extends TerminalDeterministicInitFormula {
	
	private Atom child;
	
	public AtomicInitFormula(Atom child) {
		this.setChild(child);
	}

	public Atom getChild() {
		return child;
	}

	public void setChild(Atom child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return this.getChild().toString();
	}

}

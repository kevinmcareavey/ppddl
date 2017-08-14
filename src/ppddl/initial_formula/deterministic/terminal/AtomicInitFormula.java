package ppddl.initial_formula.deterministic.terminal;

import java.util.List;

import ppddl.Atom;
import ppddl.Requirements;
import ppddl.Term;
import ppddl.initial_formula.deterministic.TerminalDeterministicInitialFormula;
import ppddl.name.Predicate;

public class AtomicInitFormula extends TerminalDeterministicInitialFormula {
	
	private Atom child;
	
	public AtomicInitFormula(Atom child) {
		this.setChild(child);
	}
	
	public AtomicInitFormula(Predicate predicate, List<Term> arguments) throws Exception {
		this(new Atom(predicate, arguments));
	}
	
	public AtomicInitFormula(Predicate predicate, Term... arguments) throws Exception {
		this(new Atom(predicate, arguments));
	}
	
	public AtomicInitFormula(Predicate predicate) {
		this(new Atom(predicate));
	}

	public Atom getChild() {
		return child;
	}

	public void setChild(Atom child) {
		this.child = child;
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		// Supported by default
	}

	@Override
	public String toString() {
		return this.getChild().toString();
	}

}

package ppddl.main.initial_formula.deterministic.terminal;

import java.util.List;

import ppddl.exception.RequirementsException;
import ppddl.main.Atom;
import ppddl.main.Requirements;
import ppddl.main.Term;
import ppddl.main.initial_formula.deterministic.TerminalDeterministicInitialFormula;
import ppddl.main.name.Predicate;

public class AtomicInitFormula extends TerminalDeterministicInitialFormula {
	
	private Atom child;
	
	public AtomicInitFormula(Atom child) {
		this.setChild(child);
	}
	
	public AtomicInitFormula(Predicate predicate, List<Term> arguments) {
		this(new Atom(predicate, arguments));
	}
	
	public AtomicInitFormula(Predicate predicate, Term... arguments) {
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
	public void validate(Requirements requireDef) throws RequirementsException {
		// Supported by default
	}

	@Override
	public String toString() {
		return this.getChild().toString();
	}

}

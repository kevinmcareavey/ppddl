package ppddl.main.precondition.unary;

import java.util.List;

import ppddl.exception.RequirementsException;
import ppddl.main.Atom;
import ppddl.main.Requirements;
import ppddl.main.Term;
import ppddl.main.name.Predicate;
import ppddl.main.precondition.UnaryPrecondition;

public class AtomicPrecondition extends UnaryPrecondition<Atom> {

	public AtomicPrecondition(Atom child) {
		super(child);
	}
	
	public AtomicPrecondition(Predicate predicate, List<Term> arguments) {
		this(new Atom(predicate, arguments));
	}
	
	public AtomicPrecondition(Predicate predicate, Term... arguments) {
		this(new Atom(predicate, arguments));
	}
	
	public AtomicPrecondition(Predicate predicate) {
		this(new Atom(predicate));
	}

	@Override
	public String getSymbol() {
		return "";
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

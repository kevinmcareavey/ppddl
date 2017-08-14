package ppddl.precondition.unary;

import java.util.List;

import ppddl.Atom;
import ppddl.Requirements;
import ppddl.Term;
import ppddl.name.Predicate;
import ppddl.precondition.UnaryPrecondition;

public class AtomicPrecondition extends UnaryPrecondition<Atom> {

	public AtomicPrecondition(Atom child) {
		super(child);
	}
	
	public AtomicPrecondition(Predicate predicate, List<Term> arguments) throws Exception {
		this(new Atom(predicate, arguments));
	}
	
	public AtomicPrecondition(Predicate predicate, Term... arguments) throws Exception {
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
	public void validate(Requirements requireDef) throws Exception {
		// Supported by default
	}

	@Override
	public String toString() {
		return this.getChild().toString();
	}

}

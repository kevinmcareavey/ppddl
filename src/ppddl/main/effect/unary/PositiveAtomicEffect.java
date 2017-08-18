package ppddl.main.effect.unary;

import java.util.List;

import ppddl.exception.RequirementsException;
import ppddl.main.Atom;
import ppddl.main.Requirements;
import ppddl.main.Term;
import ppddl.main.effect.UnaryEffect;
import ppddl.main.name.Predicate;

public class PositiveAtomicEffect extends UnaryEffect<Atom> {

	public PositiveAtomicEffect(Atom child) {
		super(child);
	}
	
	public PositiveAtomicEffect(Predicate predicate, List<Term> arguments) {
		this(new Atom(predicate, arguments));
	}
	
	public PositiveAtomicEffect(Predicate predicate, Term... arguments) {
		this(new Atom(predicate, arguments));
	}
	
	public PositiveAtomicEffect(Predicate predicate) {
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

package ppddl.main.effect.unary;

import java.util.List;

import ppddl.exception.RequirementsException;
import ppddl.main.Atom;
import ppddl.main.Requirements;
import ppddl.main.Term;
import ppddl.main.effect.UnaryEffect;
import ppddl.main.name.Predicate;

public class NegativeAtomicEffect extends UnaryEffect<Atom> {

	public NegativeAtomicEffect(Atom child) {
		super(child);
	}
	
	public NegativeAtomicEffect(Predicate predicate, List<Term> arguments) {
		this(new Atom(predicate, arguments));
	}
	
	public NegativeAtomicEffect(Predicate predicate, Term... arguments) {
		this(new Atom(predicate, arguments));
	}
	
	public NegativeAtomicEffect(Predicate predicate) {
		this(new Atom(predicate));
	}

	@Override
	public String getSymbol() {
		return "not";
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		// Supported by default
	}

}

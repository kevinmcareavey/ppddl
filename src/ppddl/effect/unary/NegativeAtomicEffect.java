package ppddl.effect.unary;

import java.util.List;

import ppddl.Atom;
import ppddl.Requirements;
import ppddl.Term;
import ppddl.effect.UnaryEffect;
import ppddl.name.Predicate;

public class NegativeAtomicEffect extends UnaryEffect<Atom> {

	public NegativeAtomicEffect(Atom child) {
		super(child);
	}
	
	public NegativeAtomicEffect(Predicate predicate, List<Term> arguments) throws Exception {
		this(new Atom(predicate, arguments));
	}
	
	public NegativeAtomicEffect(Predicate predicate, Term... arguments) throws Exception {
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
	public void validate(Requirements requireDef) throws Exception {
		// Supported by default
	}

}

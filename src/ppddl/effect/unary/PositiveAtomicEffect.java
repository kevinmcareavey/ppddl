package ppddl.effect.unary;

import java.util.List;

import ppddl.Atom;
import ppddl.Term;
import ppddl.effect.UnaryEffect;
import ppddl.name.Predicate;

public class PositiveAtomicEffect extends UnaryEffect<Atom> {

	public PositiveAtomicEffect(Atom child) {
		super(child);
	}
	
	public PositiveAtomicEffect(Predicate predicate, List<Term> arguments) throws Exception {
		this(new Atom(predicate, arguments));
	}
	
	public PositiveAtomicEffect(Predicate predicate, Term... arguments) throws Exception {
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
	public String toString() {
		return this.getChild().toString();
	}

}

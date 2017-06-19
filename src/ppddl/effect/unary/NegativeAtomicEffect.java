package ppddl.effect.unary;

import java.util.List;

import ppddl.AtomicFormula;
import ppddl.Predicate;
import ppddl.Term;
import ppddl.effect.UnaryEffect;

public class NegativeAtomicEffect extends UnaryEffect<AtomicFormula> {

	public NegativeAtomicEffect(AtomicFormula child) {
		super(child);
	}
	
	public NegativeAtomicEffect(Predicate predicate, List<Term> arguments) {
		this(new AtomicFormula(predicate, arguments));
	}
	
	public NegativeAtomicEffect(Predicate predicate, Term... arguments) {
		this(new AtomicFormula(predicate, arguments));
	}
	
	public NegativeAtomicEffect(Predicate predicate) {
		this(new AtomicFormula(predicate));
	}

	@Override
	public String getSymbol() {
		return "not";
	}

}

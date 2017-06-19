package ppddl.effect.unary;

import java.util.List;

import ppddl.AtomicFormula;
import ppddl.Predicate;
import ppddl.Term;
import ppddl.effect.UnaryEffect;

public class PositiveAtomicEffect extends UnaryEffect<AtomicFormula> {

	public PositiveAtomicEffect(AtomicFormula child) {
		super(child);
	}
	
	public PositiveAtomicEffect(Predicate predicate, List<Term> arguments) {
		this(new AtomicFormula(predicate, arguments));
	}
	
	public PositiveAtomicEffect(Predicate predicate, Term... arguments) {
		this(new AtomicFormula(predicate, arguments));
	}
	
	public PositiveAtomicEffect(Predicate predicate) {
		this(new AtomicFormula(predicate));
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

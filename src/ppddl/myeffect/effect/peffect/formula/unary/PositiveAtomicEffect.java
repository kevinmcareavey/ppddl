package ppddl.myeffect.effect.peffect.formula.unary;

import java.util.List;

import ppddl.AtomicFormula;
import ppddl.Predicate;
import ppddl.Term;
import ppddl.myeffect.effect.peffect.formula.Unary;

public class PositiveAtomicEffect extends Unary {

	public PositiveAtomicEffect(AtomicFormula<Term> child) {
		super(child);
	}
	
	public PositiveAtomicEffect(Predicate predicate, List<Term> arguments) {
		this(new AtomicFormula<Term>(predicate, arguments));
	}
	
	public PositiveAtomicEffect(Predicate predicate, Term... arguments) {
		this(new AtomicFormula<Term>(predicate, arguments));
	}
	
	public PositiveAtomicEffect(Predicate predicate) {
		this(new AtomicFormula<Term>(predicate));
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

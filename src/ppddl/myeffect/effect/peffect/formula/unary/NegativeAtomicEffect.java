package ppddl.myeffect.effect.peffect.formula.unary;

import java.util.List;

import ppddl.AtomicFormula;
import ppddl.Predicate;
import ppddl.Term;
import ppddl.myeffect.effect.peffect.formula.Unary;

public class NegativeAtomicEffect extends Unary {

	public NegativeAtomicEffect(AtomicFormula<Term> child) {
		super(child);
	}
	
	public NegativeAtomicEffect(Predicate predicate, List<Term> arguments) {
		this(new AtomicFormula<Term>(predicate, arguments));
	}
	
	public NegativeAtomicEffect(Predicate predicate, Term... arguments) {
		this(new AtomicFormula<Term>(predicate, arguments));
	}
	
	public NegativeAtomicEffect(Predicate predicate) {
		this(new AtomicFormula<Term>(predicate));
	}

	@Override
	public String getSymbol() {
		return "not";
	}

}

package ppddl.gd.formula.unary;

import java.util.List;

import ppddl.AtomicFormula;
import ppddl.Predicate;
import ppddl.Term;
import ppddl.gd.formula.Unary;

public class Atom extends Unary<AtomicFormula<Term>> {

	public Atom(AtomicFormula<Term> child) {
		super(child);
	}
	
	public Atom(Predicate predicate, List<Term> arguments) {
		this(new AtomicFormula<Term>(predicate, arguments));
	}
	
	public Atom(Predicate predicate, Term... arguments) {
		this(new AtomicFormula<Term>(predicate, arguments));
	}
	
	public Atom(Predicate predicate) {
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

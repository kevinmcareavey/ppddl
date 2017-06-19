package ppddl.precondition.unary;

import java.util.List;

import ppddl.AtomicFormula;
import ppddl.Predicate;
import ppddl.Term;
import ppddl.precondition.UnaryPrecondition;

public class AtomicPrecondition extends UnaryPrecondition<AtomicFormula> {

	public AtomicPrecondition(AtomicFormula child) {
		super(child);
	}
	
	public AtomicPrecondition(Predicate predicate, List<Term> arguments) {
		this(new AtomicFormula(predicate, arguments));
	}
	
	public AtomicPrecondition(Predicate predicate, Term... arguments) {
		this(new AtomicFormula(predicate, arguments));
	}
	
	public AtomicPrecondition(Predicate predicate) {
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

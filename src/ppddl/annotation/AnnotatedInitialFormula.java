package ppddl.annotation;

import ppddl.Annotation;
import ppddl.arithmetic_expression.my_number.Probability;
import ppddl.initial_formula.DeterministicInitialFormula;

public class AnnotatedInitialFormula extends Annotation<DeterministicInitialFormula> {
	
	public AnnotatedInitialFormula(Probability probability, DeterministicInitialFormula aInitEl) {
		super(probability, aInitEl);
	}

}

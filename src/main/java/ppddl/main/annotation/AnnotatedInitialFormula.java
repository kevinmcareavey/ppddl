package ppddl.main.annotation;

import ppddl.main.Annotation;
import ppddl.main.arithmetic_expression.my_number.Probability;
import ppddl.main.initial_formula.DeterministicInitialFormula;

public class AnnotatedInitialFormula extends Annotation<DeterministicInitialFormula> {
	
	public AnnotatedInitialFormula(Probability probability, DeterministicInitialFormula aInitEl) {
		super(probability, aInitEl);
	}

}

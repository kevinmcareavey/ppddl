package ppddl.annotated;

import ppddl.Annotated;
import ppddl.arithmeticexpression.mynumber.Probability;
import ppddl.initformula.DeterministicInitFormula;

public class AnnotatedInitFormula extends Annotated<DeterministicInitFormula> {
	
	public AnnotatedInitFormula(Probability probability, DeterministicInitFormula aInitEl) {
		super(probability, aInitEl);
	}

}

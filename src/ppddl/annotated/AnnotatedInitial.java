package ppddl.annotated;

import ppddl.Annotated;
import ppddl.arithmeticexpression.mynumber.Probability;
import ppddl.initel.AInitEl;

public class AnnotatedInitial extends Annotated<AInitEl> {
	
	public AnnotatedInitial(Probability probability, AInitEl aInitEl) {
		super(probability, aInitEl);
	}

}

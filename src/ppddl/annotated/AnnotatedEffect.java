package ppddl.annotated;

import ppddl.Annotated;
import ppddl.Effect;
import ppddl.arithmeticexpression.mynumber.Probability;

public class AnnotatedEffect extends Annotated<Effect> {
	
	public AnnotatedEffect(Probability probability, Effect effect) {
		super(probability, effect);
	}
	
}

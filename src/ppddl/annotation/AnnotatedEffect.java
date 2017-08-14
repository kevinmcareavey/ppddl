package ppddl.annotation;

import ppddl.Annotation;
import ppddl.Effect;
import ppddl.arithmetic_expression.my_number.Probability;

public class AnnotatedEffect extends Annotation<Effect> {
	
	public AnnotatedEffect(Probability probability, Effect effect) {
		super(probability, effect);
	}
	
}

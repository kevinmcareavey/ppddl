package ppddl.main.annotation;

import ppddl.main.Annotation;
import ppddl.main.Effect;
import ppddl.main.arithmetic_expression.my_number.Probability;

public class AnnotatedEffect extends Annotation<Effect> {
	
	public AnnotatedEffect(Probability probability, Effect effect) {
		super(probability, effect);
	}
	
}

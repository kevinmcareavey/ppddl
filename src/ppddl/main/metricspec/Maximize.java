package ppddl.main.metricspec;

import ppddl.exception.GoalException;
import ppddl.main.ArithmeticExpression;
import ppddl.main.MetricSpec;

public class Maximize extends MetricSpec {

	public Maximize(ArithmeticExpression child) throws GoalException {
		super(child);
	}
	
	@Override
	public String getSymbol() {
		return "maximize";
	}

}

package ppddl.metricspec;

import ppddl.ArithmeticExpression;
import ppddl.MetricSpec;

public class Maximize extends MetricSpec {

	public Maximize(ArithmeticExpression child) throws Exception {
		super(child);
	}
	
	@Override
	public String getSymbol() {
		return "maximize";
	}

}

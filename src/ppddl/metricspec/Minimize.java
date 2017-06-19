package ppddl.metricspec;

import ppddl.ArithmeticExpression;
import ppddl.MetricSpec;

public class Minimize extends MetricSpec {

	public Minimize(ArithmeticExpression child) throws Exception {
		super(child);
	}

	@Override
	public String getSymbol() {
		return "minimize";
	}

}

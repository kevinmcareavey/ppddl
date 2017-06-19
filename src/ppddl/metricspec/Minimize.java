package ppddl.metricspec;

import ppddl.FExp;
import ppddl.MetricSpec;

public class Minimize extends MetricSpec {

	public Minimize(FExp child) throws Exception {
		super(child);
	}

	@Override
	public String getSymbol() {
		return "minimize";
	}

}

package ppddl.metricspec;

import ppddl.FExp;
import ppddl.MetricSpec;

public class Minimize extends MetricSpec {

	public Minimize(FExp child) {
		super(child);
	}

	@Override
	public String getSymbol() {
		return "minimize";
	}

}

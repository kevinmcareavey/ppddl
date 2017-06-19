package ppddl.metricspec;

import ppddl.FExp;
import ppddl.MetricSpec;

public class Maximize extends MetricSpec {

	public Maximize(FExp child) throws Exception {
		super(child);
	}
	
	@Override
	public String getSymbol() {
		return "maximize";
	}

}

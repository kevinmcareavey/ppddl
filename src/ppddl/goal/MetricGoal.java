package ppddl.goal;

import ppddl.Goal;
import ppddl.MetricSpec;
import ppddl.Requirements;

public class MetricGoal extends Goal {
	
	private MetricSpec metricSpec;
	
	public MetricGoal(MetricSpec metricSpec) {
		this.setMetricSpec(metricSpec);
	}
	
	public MetricSpec getMetricSpec() {
		return metricSpec;
	}
	
	public void setMetricSpec(MetricSpec metricSpec) {
		this.metricSpec = metricSpec;
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		// Supported by default
	}

	@Override
	public String toString() {
		return this.getMetricSpec().toString();
	}

}

package ppddl.main.goal;

import ppddl.exception.RequirementsException;
import ppddl.main.Goal;
import ppddl.main.MetricSpec;
import ppddl.main.Requirements;

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
	public void validate(Requirements requireDef) throws RequirementsException {
		// Supported by default
	}

	@Override
	public String toString() {
		return this.getMetricSpec().toString();
	}

}

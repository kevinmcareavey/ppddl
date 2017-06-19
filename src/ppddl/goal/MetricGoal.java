package ppddl.goal;

import ppddl.Goal;
import ppddl.MetricSpec;

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
	public String toString() {
		return this.getMetricSpec().toString();
	}

}

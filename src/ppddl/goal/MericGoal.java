package ppddl.goal;

import ppddl.Goal;
import ppddl.MetricSpec;

public class MericGoal extends Goal {
	
	private MetricSpec metricSpec;
	
	public MericGoal(MetricSpec metricSpec) {
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
		return metricSpec.toString();
	}

}

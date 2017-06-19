package ppddl.goal.gdgoal;

import ppddl.GoalSpec;
import ppddl.MetricSpec;
import ppddl.goal.GDGoal;

public class GDMetricGoal extends GDGoal {
	
	private MetricSpec metricSpec;
	
	public GDMetricGoal(GoalSpec goalSpec, MetricSpec metricSpec) {
		super(goalSpec);
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
		return this.getGoalSpec().toString() + " " + this.getMetricSpec().toString();
	}

}

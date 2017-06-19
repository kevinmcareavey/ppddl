package ppddl.goal.preconditiongoal;

import ppddl.GoalSpec;
import ppddl.MetricSpec;
import ppddl.goal.PreconditionGoal;

public class PreconditionMetricGoal extends PreconditionGoal {
	
	private MetricSpec metricSpec;
	
	public PreconditionMetricGoal(GoalSpec goalSpec, MetricSpec metricSpec) {
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
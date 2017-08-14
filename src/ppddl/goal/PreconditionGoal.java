package ppddl.goal;

import ppddl.Goal;
import ppddl.GoalSpec;
import ppddl.MetricSpec;
import ppddl.Requirements;

public class PreconditionGoal extends Goal {
	
	private GoalSpec goalSpec;
	private MetricSpec metricSpec;
	
	public PreconditionGoal(GoalSpec goalSpec, MetricSpec metricSpec) {
		this.setGoalSpec(goalSpec);
		this.setMetricSpec(metricSpec);
	}
	
	public PreconditionGoal(GoalSpec goalSpec) {
		this(goalSpec, null);
	}
	
	public GoalSpec getGoalSpec() {
		return goalSpec;
	}
	
	public void setGoalSpec(GoalSpec goalSpec) {
		this.goalSpec = goalSpec;
	}
	
	public MetricSpec getMetricSpec() {
		return metricSpec;
	}
	
	public void setMetricSpec(MetricSpec metricSpec) {
		this.metricSpec = metricSpec;
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		this.getGoalSpec().validate(requireDef);
	}

	@Override
	public String toString() {
		String output = this.getGoalSpec().toString();
		if(this.getMetricSpec() != null) {
			output += " " + this.getMetricSpec().toString();
		}
		return output;
	}

}

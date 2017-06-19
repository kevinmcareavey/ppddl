package ppddl.goal;

import ppddl.Goal;
import ppddl.GoalSpec;
import ppddl.MetricSpec;

public class GDGoal extends Goal {
	
	private GoalSpec goalSpec;
	private MetricSpec metricSpec;
	
	public GDGoal(GoalSpec goalSpec, MetricSpec metricSpec) {
		this.setGoalSpec(goalSpec);
		this.setMetricSpec(metricSpec);
	}
	
	public GDGoal(GoalSpec goalSpec) {
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
	public String toString() {
		String output = goalSpec.toString();
		if(metricSpec != null) {
			output += " " + metricSpec.toString();
		}
		return output;
	}

}

package ppddl.goal;

import ppddl.Goal;
import ppddl.GoalSpec;

public class GDGoal extends Goal {
	
	private GoalSpec goalSpec;
	
	public GDGoal(GoalSpec goalSpec) {
		this.setGoalSpec(goalSpec);
	}
	
	public GoalSpec getGoalSpec() {
		return goalSpec;
	}
	
	public void setGoalSpec(GoalSpec goalSpec) {
		this.goalSpec = goalSpec;
	}

	@Override
	public String toString() {
		return goalSpec.toString();
	}

}

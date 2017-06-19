package ppddl.goal;

import ppddl.Goal;
import ppddl.GoalSpec;

public class PreconditionGoal extends Goal {
	
	private GoalSpec goalSpec;
	
	public PreconditionGoal(GoalSpec goalSpec) {
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
		return this.getGoalSpec().toString();
	}

}

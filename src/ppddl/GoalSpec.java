package ppddl;

public class GoalSpec {
	
	private GD goal;
	private FExp goalReward;
	
	public GoalSpec(GD goal, FExp goalReward) {
		this.setGoal(goal);
		this.setGoalReward(goalReward);
	}
	
	public GoalSpec(GD goal) {
		this.setGoal(goal);
		this.setGoalReward(goalReward);
	}
	
	public GD getGoal() {
		return goal;
	}
	
	public void setGoal(GD goal) {
		this.goal = goal;
	}
	
	public FExp getGoalReward() {
		return goalReward;
	}
	
	public void setGoalReward(FExp goalReward) {
		this.goalReward = goalReward;
	}

	@Override
	public String toString() {
		String output = "(:goal " + this.getGoal().toString();
		if(this.getGoalReward() != null) {
			output += " (:goal-reward " + this.getGoalReward().toString() + ")";
		}
		output += ")";
		return output;
	}

}

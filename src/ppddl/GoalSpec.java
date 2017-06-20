package ppddl;

public class GoalSpec {
	
	private Precondition goal;
	private ArithmeticExpression goalReward;
	
	public GoalSpec(Precondition goal, ArithmeticExpression goalReward) throws Exception {
		this.setGoal(goal);
		if(goalReward != null) {
			if(!goalReward.isGround()) {
				throw new Exception("goal-reward expression must be ground");
			}
		}
		this.setGoalReward(goalReward);
	}
	
	public GoalSpec(Precondition goal) throws Exception {
		this(goal, null);
	}
	
	public Precondition getGoal() {
		return goal;
	}
	
	public void setGoal(Precondition goal) {
		this.goal = goal;
	}
	
	public ArithmeticExpression getGoalReward() {
		return goalReward;
	}
	
	public void setGoalReward(ArithmeticExpression goalReward) {
		this.goalReward = goalReward;
	}
	
	@Override
	public String toString() {
		String output = "(:goal " + this.getGoal().toString() + ")";
		if(goalReward != null) {
			output += " (:goal-reward " + this.getGoalReward().toString() + ")";
		}
		return output;
	}

}

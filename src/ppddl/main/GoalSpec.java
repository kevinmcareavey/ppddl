package ppddl.main;

import ppddl.exception.GoalException;
import ppddl.exception.RequirementsException;

public class GoalSpec implements Requires {
	
	private Precondition goal;
	private ArithmeticExpression goalReward;
	
	public GoalSpec(Precondition goal, ArithmeticExpression goalReward) throws GoalException {
		this.setGoal(goal);
		if(goalReward != null) {
			if(!goalReward.isGround()) {
				throw new GoalException("goal-reward expression must be ground");
			}
		}
		this.setGoalReward(goalReward);
	}
	
	public GoalSpec(Precondition goal) throws GoalException {
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
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledRewards() && this.getGoalReward() != null) {
			throw new RequirementsException("reward goals are defined but :rewards is not required");
		}
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

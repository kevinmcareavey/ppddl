package ppddl.goalspec;

import ppddl.FExp;
import ppddl.GD;
import ppddl.GoalSpec;

public class GoalRewardSpec extends GoalSpec {

	private FExp goalReward;
	
	public GoalRewardSpec(GD goal, FExp goalReward) throws Exception {
		super(goal);
		if(!goalReward.isGround()) {
			throw new Exception("goal-reward expression must be ground");
		}
		this.setGoalReward(goalReward);
	}
	
	public FExp getGoalReward() {
		return goalReward;
	}
	
	public void setGoalReward(FExp goalReward) {
		this.goalReward = goalReward;
	}

	@Override
	public String toString() {
		return "(:goal " + this.getGoal().toString() + ") (:goal-reward " + this.getGoalReward().toString() + ")";
	}

}

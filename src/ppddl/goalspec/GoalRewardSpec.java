package ppddl.goalspec;

import ppddl.ArithmeticExpression;
import ppddl.Precondition;
import ppddl.GoalSpec;

public class GoalRewardSpec extends GoalSpec {

	private ArithmeticExpression goalReward;
	
	public GoalRewardSpec(Precondition goal, ArithmeticExpression goalReward) throws Exception {
		super(goal);
		if(!goalReward.isGround()) {
			throw new Exception("goal-reward expression must be ground");
		}
		this.setGoalReward(goalReward);
	}
	
	public ArithmeticExpression getGoalReward() {
		return goalReward;
	}
	
	public void setGoalReward(ArithmeticExpression goalReward) {
		this.goalReward = goalReward;
	}

	@Override
	public String toString() {
		return super.toString() + " (:goal-reward " + this.getGoalReward().toString() + ")";
	}

}

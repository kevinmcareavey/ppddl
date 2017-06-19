package ppddl;

public class GoalSpec {
	
	private GD goal;
	
	public GoalSpec(GD goal) {
		this.setGoal(goal);
	}
	
	public GD getGoal() {
		return goal;
	}
	
	public void setGoal(GD goal) {
		this.goal = goal;
	}

	@Override
	public String toString() {
		return "(:goal " + this.getGoal().toString() + ")";
	}

}

package ppddl;

public class GoalSpec {
	
	private Precondition goal;
	
	public GoalSpec(Precondition goal) {
		this.setGoal(goal);
	}
	
	public Precondition getGoal() {
		return goal;
	}
	
	public void setGoal(Precondition goal) {
		this.goal = goal;
	}

	@Override
	public String toString() {
		return "(:goal " + this.getGoal().toString() + ")";
	}

}

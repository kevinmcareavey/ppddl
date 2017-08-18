package ppddl.main;

import ppddl.exception.GoalException;
import ppddl.exception.RequirementsException;

public abstract class MetricSpec implements Requires {
	
	private ArithmeticExpression child;
	
	public MetricSpec(ArithmeticExpression child) throws GoalException {
		if(!child.isGround()) {
			throw new GoalException("optimization expressions must be ground");
		}
		this.setChild(child);
	}
	
	public ArithmeticExpression getChild() {
		return child;
	}
	
	public void setChild(ArithmeticExpression child) {
		this.child = child;
	}
	
	public abstract String getSymbol();
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		this.getChild().validate(requireDef);
	}

	@Override
	public String toString() {
		return "(:metric " + this.getSymbol() + " " + this.getChild() + ")";
	}

}

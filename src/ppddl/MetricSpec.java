package ppddl;

public abstract class MetricSpec implements Requires {
	
	private ArithmeticExpression child;
	
	public MetricSpec(ArithmeticExpression child) throws Exception {
		if(!child.isGround()) {
			throw new Exception("optimization expressions must be ground");
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
	public void validate(Requirements requireDef) throws Exception {
		this.getChild().validate(requireDef);
	}

	@Override
	public String toString() {
		return "(:metric " + this.getSymbol() + " " + this.getChild() + ")";
	}

}

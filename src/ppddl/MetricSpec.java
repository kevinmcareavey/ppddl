package ppddl;

public abstract class MetricSpec {
	
	private FExp child;
	
	public MetricSpec(FExp child) throws Exception {
		if(!child.isGround()) {
			throw new Exception("optimization expressions must be ground");
		}
		this.setChild(child);
	}
	
	public FExp getChild() {
		return child;
	}
	
	public void setChild(FExp child) {
		this.child = child;
	}
	
	public abstract String getSymbol();

	@Override
	public String toString() {
		return "(:metric " + this.getSymbol() + " " + this.getChild() + ")";
	}

}

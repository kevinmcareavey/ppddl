package ppddl;

public abstract class MetricSpec {
	
	private FExp child;
	
	public MetricSpec(FExp child) {
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

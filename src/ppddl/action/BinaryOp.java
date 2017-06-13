package ppddl.action;

public enum BinaryOp {
	
	add, subtract, multiply, divide;
	
	public String toString() {
		switch(this) {
			case add: return "+";
			case subtract: return "-";
			case multiply: return "*";
			case divide: return "/";
			default: return null;
		}
	}
	
}

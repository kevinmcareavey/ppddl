package ppddl.action;

public enum BinaryComp {
	
	lt, le, eq, ge, gt;
	
	public String toString() {
		switch(this) {
			case lt: return "<";
			case le: return "<=";
			case eq: return "=";
			case ge: return ">=";
			case gt: return ">";
			default: return null;
		}
	}
	
}

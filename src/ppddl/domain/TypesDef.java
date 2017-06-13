package ppddl.domain;

import ppddl.Name;

public class TypesDef extends TypedList<Name> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8442844967011689198L;

	@Override
	public String toString() {
		if(this.isEmpty()) {
			return "";
		} else {
			return "(:types " + super.toString() + ")";
		}
	}
	
}

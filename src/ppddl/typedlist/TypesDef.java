package ppddl.typedlist;

import ppddl.TypedList;
import ppddl.type.PrimitiveType;

public class TypesDef extends TypedList<PrimitiveType> {

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

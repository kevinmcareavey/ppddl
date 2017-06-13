package ppddl.domain;

import ppddl.Name;

public class ConstantsDef extends TypedList<Name> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6155874088106924688L;
	
	@Override
	public String toString() {
		if(this.isEmpty()) {
			return "";
		} else {
			return "(:constants " + super.toString() + ")";
		}
	}
	
}

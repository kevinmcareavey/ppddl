package ppddl.functiontypedlist;

import ppddl.FunctionTypedList;

public class Functions extends FunctionTypedList {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4876922820770573396L;

	@Override
	public String toString() {
		if(this.isEmpty()) {
			return "";
		} else {
			return "(:functions " + super.toString() + ")";
		}
	}
	
}

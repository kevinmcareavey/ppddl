package ppddl.typedlist;

import ppddl.TypedList;
import ppddl.term.Constant;

public class Objects extends TypedList<Constant> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6097546069652499330L;

	@Override
	public String toString() {
		if(this.isEmpty()) {
			return "";
		} else {
			return "(:objects " + super.toString() + ")";
		}
	}

}

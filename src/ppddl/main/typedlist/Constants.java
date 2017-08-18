package ppddl.main.typedlist;

import ppddl.main.TypedList;
import ppddl.main.term.Constant;

public class Constants extends TypedList<Constant> {

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

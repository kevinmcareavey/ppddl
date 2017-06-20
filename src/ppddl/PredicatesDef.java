package ppddl;

import java.util.ArrayList;

public class PredicatesDef extends ArrayList<AtomSkeleton> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8340192634512913720L;
	
	@Override
	public String toString() {
		if(this.isEmpty()) {
			return "";
		} else {
			String output = "(:predicates";
			for(AtomSkeleton afs : this) {
				output += " " + afs;
			}
			output += ")";
			return output;
		}
	}

}

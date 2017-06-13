package ppddl.domain;

import java.util.ArrayList;

public class PredicatesDef extends ArrayList<AtomicFormulaSkeleton> {

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
			for(AtomicFormulaSkeleton afs : this) {
				output += " " + afs;
			}
			output += ")";
			return output;
		}
	}

}

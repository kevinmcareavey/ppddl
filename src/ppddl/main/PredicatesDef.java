package ppddl.main;

import java.util.ArrayList;

import ppddl.exception.RequirementsException;

public class PredicatesDef extends ArrayList<AtomSkeleton> implements Requires {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8340192634512913720L;
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		for(AtomSkeleton atomSkeleton : this) {
			atomSkeleton.validate(requireDef);
		}
	}
	
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

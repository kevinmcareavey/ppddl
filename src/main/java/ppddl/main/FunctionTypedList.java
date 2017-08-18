package ppddl.main;

import java.util.ArrayList;

import ppddl.exception.RequirementsException;
import ppddl.main.type.SimpleType;

public abstract class FunctionTypedList extends ArrayList<FunctionSkeleton> implements Requires {
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		for(FunctionSkeleton functionSkeleton : this) {
			functionSkeleton.validate(requireDef);
		}
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 7083450318135723006L;

	@Override
	public String toString() {
		String output = "";
		for(FunctionSkeleton functionSkeleton : this) {
			output += functionSkeleton.toString() + " ";
		}
		output += "- " + SimpleType.NUMBER.toString(); // Not actually needed...?
		return output;
	}
	
}

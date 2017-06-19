package ppddl;

import java.util.ArrayList;

public abstract class FunctionTypedList extends ArrayList<FunctionSkeleton> {

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
		output += "- number";
		return output;
	}
	
}

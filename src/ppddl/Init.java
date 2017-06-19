package ppddl;

import java.util.ArrayList;

public class Init extends ArrayList<InitEl> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7948006237260975764L;

	@Override
	public String toString() {
		String output = "(:init";
		for(InitEl initEl : this) {
			output += " " + initEl.toString();
		}
		output += ")";
		return output;
	}

}

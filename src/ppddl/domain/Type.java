package ppddl.domain;

import java.util.ArrayList;

public class Type extends ArrayList<PrimitiveType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 718801531334393398L;

	@Override
	public String toString() {
		if(this.size() == 1) {
			return this.get(0).toString();
		} else {
			String output = "(either";
			for(PrimitiveType primitiveType: this) {
				output += " " + primitiveType.toString();
			}
			output += ")";
			return output;
		}
	}

}

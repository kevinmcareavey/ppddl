package ppddl.action;

import ppddl.domain.StructureDef;
import ppddl.domain.TypedList;

public class ActionDef extends StructureDef {
	
	private ActionSymbol actionSymbol;
	private TypedList<Variable> variables;
	private ActionDefBody actionDefBody;
	
	@Override
	public String toString() {
		String output = "(:action " + actionSymbol.toString() + "\n";
		output += ":parameters (" + variables.toString() + ")\n";
		output += actionDefBody.toString() + "\n";
		output += "\n";
		return output;
	}

}

package ppddl.structuredef;

import ppddl.ActionDefBody;
import ppddl.ActionSymbol;
import ppddl.StructureDef;

public class ActionDef extends StructureDef {
	
	private ActionSymbol actionSymbol;
	private ActionDefBody actionDefBody;
	
	public ActionDef(ActionSymbol actionSymbol, ActionDefBody actionDefBody) {
		this.setActionSymbol(actionSymbol);
		this.setActionDefBody(actionDefBody);
	}
	
	public ActionDef(ActionSymbol actionSymbol) {
		this(actionSymbol, null);
	}

	public ActionSymbol getActionSymbol() {
		return actionSymbol;
	}

	public void setActionSymbol(ActionSymbol actionSymbol) {
		this.actionSymbol = actionSymbol;
	}

	public ActionDefBody getActionDefBody() {
		return actionDefBody;
	}

	public void setActionDefBody(ActionDefBody actionDefBody) {
		this.actionDefBody = actionDefBody;
	}
	
	@Override
	public String toString() {
		String output = "(:action " + this.getActionSymbol().toString();
		if(this.getActionDefBody() != null) {
			output += "\n" + this.getActionDefBody().toString();
		}
		output += ")";
		return output;
	}

}

package ppddl;

import ppddl.name.ActionSymbol;
import ppddl.term.Variable;

public class ActionDef {
	
	private ActionSymbol actionSymbol;
	private TypedList<Variable> variables;
	private ActionDefBody actionDefBody;
	
	public ActionDef(ActionSymbol actionSymbol, TypedList<Variable> variables, ActionDefBody actionDefBody) {
		this.setActionSymbol(actionSymbol);
		this.setVariables(variables);
		this.setActionDefBody(actionDefBody);
	}
	
	public ActionDef(ActionSymbol actionSymbol, ActionDefBody actionDefBody) {
		this(actionSymbol, new TypedList<Variable>(), actionDefBody);
	}
	
	public ActionDef(ActionSymbol actionSymbol) {
		this(actionSymbol, new ActionDefBody());
	}

	public ActionSymbol getActionSymbol() {
		return actionSymbol;
	}

	public void setActionSymbol(ActionSymbol actionSymbol) {
		this.actionSymbol = actionSymbol;
	}
	
	public TypedList<Variable> getVariables() {
		return variables;
	}

	public void setVariables(TypedList<Variable> variables) {
		this.variables = variables;
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
		if(!this.getVariables().isEmpty()) {
			output += "\n:parameters (" + this.getVariables().toString() + ")";
		}
		if(!this.getActionDefBody().isEmpty()) {
			output += "\n" + this.getActionDefBody().toString();
		}
		output += ")";
		return output;
	}

}

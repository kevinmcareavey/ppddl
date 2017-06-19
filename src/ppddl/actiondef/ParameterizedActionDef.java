package ppddl.actiondef;

import ppddl.ActionDef;
import ppddl.ActionDefBody;
import ppddl.ActionSymbol;
import ppddl.TypedList;
import ppddl.term.Variable;

public class ParameterizedActionDef extends ActionDef {
	
	private TypedList<Variable> variables;
	
	public ParameterizedActionDef(ActionSymbol actionSymbol, TypedList<Variable> variables, ActionDefBody actionDefBody) {
		super(actionSymbol, actionDefBody);
		this.setVariables(variables);
	}

	public TypedList<Variable> getVariables() {
		return variables;
	}

	public void setVariables(TypedList<Variable> variables) {
		this.variables = variables;
	}
	
	@Override
	public String toString() {
		String output = "(:action " + this.getActionSymbol().toString();
		if(this.getVariables() != null) {
			output += "\n:parameters (" + this.getVariables().toString() + ")";
		}
		if(this.getActionDefBody() != null) {
			output += "\n" + this.getActionDefBody().toString();
		}
		output += ")";
		return output;
	}

}

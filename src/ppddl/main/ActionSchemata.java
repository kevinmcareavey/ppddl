package ppddl.main;

import ppddl.exception.RequirementsException;
import ppddl.main.name.ActionSymbol;
import ppddl.main.term.Variable;

public class ActionSchemata implements Requires {
	
	private ActionSymbol actionSymbol;
	private TypedList<Variable> variables;
	private Precondition precondition;
	private Effect effect;
	
	public ActionSchemata(ActionSymbol actionSymbol, TypedList<Variable> variables, Precondition precondition, Effect effect) {
		this.setActionSymbol(actionSymbol);
		this.setVariables(variables);
		this.setPrecondition(precondition);
		this.setEffect(effect);
	}
	
	public ActionSchemata(ActionSymbol actionSymbol, Precondition precondition, Effect effect) {
		this(actionSymbol, new TypedList<Variable>(), precondition, effect);
	}
	
	public ActionSchemata(ActionSymbol actionSymbol, Precondition precondition) {
		this(actionSymbol, null, null);
	}
	
	public ActionSchemata(ActionSymbol actionSymbol, Effect effect) {
		this(actionSymbol, null, null);
	}
	
	public ActionSchemata(ActionSymbol actionSymbol) {
		this(actionSymbol, null, null);
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
	
	public Precondition getPrecondition() {
		return precondition;
	}

	public void setPrecondition(Precondition precondition) {
		this.precondition = precondition;
	}

	public Effect getEffect() {
		return effect;
	}

	public void setEffect(Effect effect) {
		this.effect = effect;
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		this.getVariables().validate(requireDef);
		if(this.getPrecondition() != null) {
			this.getPrecondition().validate(requireDef);
		}
		if(this.getEffect() != null) {
			this.getEffect().validate(requireDef);
		}
	}
	
	@Override
	public String toString() {
		String output = "(:action " + this.getActionSymbol().toString();
		if(!this.getVariables().isEmpty()) {
			output += "\n\t\t:parameters (" + this.getVariables().toString() + ")";
		}
		if(this.getPrecondition() != null) {
			output += "\n\t\t:precondition " + this.getPrecondition().toString();
		}
		if(this.getEffect() != null) {
			output += "\n\t\t:effect " + this.getEffect().toString();
		}
		output += ")";
		return output;
	}

}

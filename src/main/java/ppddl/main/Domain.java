package ppddl.main;

import java.util.ArrayList;
import java.util.List;

import ppddl.exception.NameException;
import ppddl.exception.RequirementsException;
import ppddl.main.functiontypedlist.Functions;
import ppddl.main.typedlist.Constants;
import ppddl.main.typedlist.Types;

public class Domain implements Requires {
	
	private Name name;
	private Requirements requireDef;
	private Types typesDef;
	private Constants constantsDef;
	private PredicatesDef predicatesDef;
	private Functions functionsDef;
	private List<ActionSchemata> actionDefs;
	
	public Domain(Name name) {
		this.setName(name);
		this.setRequireDef(new Requirements());
		this.setTypesDef(new Types());
		this.setConstantsDef(new Constants());
		this.setPredicatesDef(new PredicatesDef());
		this.setFunctionsDef(new Functions());
		this.setActionDefs(new ArrayList<ActionSchemata>());
	}
	
	public Domain(String name) throws NameException {
		this(new Name(name));
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Requirements getRequireDef() {
		return requireDef;
	}

	public void setRequireDef(Requirements requireDef) {
		this.requireDef = requireDef;
	}

	public Types getTypesDef() {
		return typesDef;
	}

	public void setTypesDef(Types typesDef) {
		this.typesDef = typesDef;
	}

	public Constants getConstantsDef() {
		return constantsDef;
	}

	public void setConstantsDef(Constants constantsDef) {
		this.constantsDef = constantsDef;
	}

	public PredicatesDef getPredicatesDef() {
		return predicatesDef;
	}

	public void setPredicatesDef(PredicatesDef predicatesDef) {
		this.predicatesDef = predicatesDef;
	}

	public Functions getFunctionsDef() {
		return functionsDef;
	}

	public void setFunctionsDef(Functions functionsDef) {
		this.functionsDef = functionsDef;
	}

	public List<ActionSchemata> getActionDefs() {
		return actionDefs;
	}

	public void setActionDefs(List<ActionSchemata> actionDefs) {
		this.actionDefs = actionDefs;
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledTyping() && !this.getTypesDef().isEmpty()) {
			throw new RequirementsException("types are defined but :typing is not required");
		}
		if(!requireDef.isEnabledFluents() && !this.getFunctionsDef().isEmpty()) {
			throw new RequirementsException("functions are defined but :fluents is not required");
		}
		this.getConstantsDef().validate(requireDef);
		this.getPredicatesDef().validate(requireDef);
		this.getFunctionsDef().validate(requireDef);
		for(ActionSchemata actionDef : this.getActionDefs()) {
			actionDef.validate(requireDef);
		}
	}
	
	public void validate() throws RequirementsException {
		this.validate(this.getRequireDef());
	}

	@Override
	public String toString() {
		String output = "(define (domain " + this.getName().toString() + ")";
		output += "\n\t" + this.getRequireDef().toString();
		if(!this.getTypesDef().isEmpty()) {
			output += "\n\t" + this.getTypesDef().toString();
		}
		if(!this.getConstantsDef().isEmpty()) {
			output += "\n\t" + this.getConstantsDef().toString();
		}
		if(!this.getPredicatesDef().isEmpty()) {
			output += "\n\t" + this.getPredicatesDef().toString();
		}
		if(!this.getFunctionsDef().isEmpty()) {
			output += "\n\t" + this.getFunctionsDef().toString();
		}
		for(ActionSchemata actionDef : this.getActionDefs()) {
			output += "\n\t" + actionDef.toString();
		}
		output += ")\n";
		return output;
	}
	
}

package ppddl;

import java.util.ArrayList;
import java.util.List;

import ppddl.functiontypedlist.FunctionsDef;
import ppddl.typedlist.ConstantsDef;
import ppddl.typedlist.TypesDef;

public class Domain {
	
	private Name name;
	private RequireDef requireDef;
	private TypesDef typesDef;
	private ConstantsDef constantsDef;
	private PredicatesDef predicatesDef;
	private FunctionsDef functionsDef;
	private List<ActionDef> actionDefs;
	
	public Domain(Name name) {
		this.setName(name);
		this.setRequireDef(new RequireDef());
		this.setTypesDef(new TypesDef());
		this.setConstantsDef(new ConstantsDef());
		this.setPredicatesDef(new PredicatesDef());
		this.setFunctionsDef(new FunctionsDef());
		this.setActionDefs(new ArrayList<ActionDef>());
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public RequireDef getRequireDef() {
		return requireDef;
	}

	public void setRequireDef(RequireDef requireDef) {
		this.requireDef = requireDef;
	}

	public TypesDef getTypesDef() {
		return typesDef;
	}

	public void setTypesDef(TypesDef typesDef) {
		this.typesDef = typesDef;
	}

	public ConstantsDef getConstantsDef() {
		return constantsDef;
	}

	public void setConstantsDef(ConstantsDef constantsDef) {
		this.constantsDef = constantsDef;
	}

	public PredicatesDef getPredicatesDef() {
		return predicatesDef;
	}

	public void setPredicatesDef(PredicatesDef predicatesDef) {
		this.predicatesDef = predicatesDef;
	}

	public FunctionsDef getFunctionsDef() {
		return functionsDef;
	}

	public void setFunctionsDef(FunctionsDef functionsDef) {
		this.functionsDef = functionsDef;
	}

	public List<ActionDef> getActionDefs() {
		return actionDefs;
	}

	public void setActionDefs(List<ActionDef> actionDefs) {
		this.actionDefs = actionDefs;
	}

	@Override
	public String toString() {
		String output = "(define (domain " + this.getName().toString() + ")";
		output += "\n" + this.getRequireDef().toString();
		output += "\n" + this.getTypesDef().toString();
		output += "\n" + this.getConstantsDef().toString();
		output += "\n" + this.getPredicatesDef().toString();
		output += "\n" + this.getFunctionsDef().toString();
		for(ActionDef actionDef : this.getActionDefs()) {
			output += "\n" + actionDef.toString();
		}
		output += ")";
		return output;
	}
	
}

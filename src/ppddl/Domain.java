package ppddl;

import java.util.List;

import ppddl.domain.ConstantsDef;
import ppddl.domain.FunctionsDef;
import ppddl.domain.PredicatesDef;
import ppddl.domain.RequireDef;
import ppddl.domain.StructureDef;
import ppddl.domain.TypesDef;

public class Domain {
	
	private Name name;
	private RequireDef requireDef;
	private TypesDef typesDef;
	private ConstantsDef constantsDef;
	private PredicatesDef predicatesDef;
	private FunctionsDef functionsDef;
	private List<StructureDef> structureDefs;
	
	public Domain(Name name) {
		this(name, new RequireDef(), null, null, null, null, null);
		this.getRequireDef().enableSTRIPS();
	}
	
	public Domain(Name name, RequireDef requireDef, TypesDef typesDef, ConstantsDef constantsDef, PredicatesDef predicatesDef, FunctionsDef functionsDef, List<StructureDef> structureDefs) {
		this.setName(name);
		this.setRequireDef(requireDef);
		this.setTypesDef(typesDef);
		this.setConstantsDef(constantsDef);
		this.setPredicatesDef(predicatesDef);
		this.setFunctionsDef(functionsDef);
		this.setStructureDefs(structureDefs);
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

	public List<StructureDef> getStructureDefs() {
		return structureDefs;
	}

	public void setStructureDefs(List<StructureDef> structureDefs) {
		this.structureDefs = structureDefs;
	}

	@Override
	public String toString() {
		String output = "(define (domain " + this.getName().toString() + ")";
		output += "\n" + requireDef.toString();
		output += "\n" + typesDef.toString();
		output += "\n" + constantsDef.toString();
		output += "\n" + predicatesDef.toString();
		output += "\n" + functionsDef.toString();
		for(StructureDef structureDef : structureDefs) {
			output += "\n" + structureDef.toString();
		}
		output += ")";
		return output;
	}
	
}

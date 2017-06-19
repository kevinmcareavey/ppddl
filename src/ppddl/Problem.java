package ppddl;

import ppddl.typedlist.ObjectsDef;

public class Problem {
	
	private Name name;
	private Name domain;
	private RequireDef requireDef;
	private ObjectsDef objectsDef;
	private Init init;
	private Goal goal;
	
	public Problem(Name name, Name domain, RequireDef requireDef, ObjectsDef objectsDef, Init init, Goal goal) {
		this.setName(name);
		this.setDomain(domain);
		this.setRequireDef(requireDef);
		this.setObjectsDef(objectsDef);
		this.setInit(init);
		this.setGoal(goal);
	}
	
	public Problem(Name name, Name domain, ObjectsDef objectsDef, Init init, Goal goal) {
		this(name, domain, null, objectsDef, init, goal);
	}
	
	public Problem(Name name, Name domain, RequireDef requireDef, Init init, Goal goal) {
		this(name, domain, requireDef, null, init, goal);
	}
	
	public Problem(Name name, Name domain, RequireDef requireDef, ObjectsDef objectsDef, Goal goal) {
		this(name, domain, requireDef, objectsDef, null, goal);
	}
	
	public Problem(Name name, Name domain, RequireDef requireDef, Goal goal) {
		this(name, domain, requireDef, null, null, goal);
	}
	
	public Problem(Name name, Name domain, ObjectsDef objectsDef, Goal goal) {
		this(name, domain, null, objectsDef, null, goal);
	}
	
	public Problem(Name name, Name domain, Init init, Goal goal) {
		this(name, domain, null, null, init, goal);
	}
	
	public Problem(Name name, Name domain, Goal goal) {
		this(name, domain, null, null, null, goal);
	}
	
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public Name getDomain() {
		return domain;
	}
	
	public void setDomain(Name domain) {
		this.domain = domain;
	}
	
	public RequireDef getRequireDef() {
		return requireDef;
	}
	
	public void setRequireDef(RequireDef requireDef) {
		this.requireDef = requireDef;
	}
	
	public ObjectsDef getObjectsDef() {
		return objectsDef;
	}
	
	public void setObjectsDef(ObjectsDef objectsDef) {
		this.objectsDef = objectsDef;
	}
	
	public Init getInit() {
		return init;
	}
	
	public void setInit(Init init) {
		this.init = init;
	}
	
	public Goal getGoal() {
		return goal;
	}
	
	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	@Override
	public String toString() {
		String output = "(define (problem " + name + ")\n";
		output += "(:domain " + this.getDomain() + ")\n";
		output += this.getRequireDef() + "\n";
		output += this.getObjectsDef() + "\n";
		output += this.getInit() + "\n";
		output += this.getGoal() + ")";
		return output;
	}

}

package ppddl;

import ppddl.typedlist.ObjectsDef;

public class Problem {
	
	private Name name;
	private Name domain;
	private RequireDef requireDef;
	private ObjectsDef objectsDef;
	private Init init;
	private Goal goal;
	
	public Problem(Name name, Name domain) {
		this.setName(name);
		this.setDomain(domain);
		this.setRequireDef(new RequireDef());
		this.setObjectsDef(new ObjectsDef());
		this.setInit(new Init());
		this.setGoal(null);
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
		if(!this.getObjectsDef().isEmpty()) {
			output += this.getObjectsDef() + "\n";
		}
		if(!this.getInit().isEmpty()) {
			output += this.getInit() + "\n";
		}
		if(this.getGoal() != null) {
			output += this.getGoal();
		}
		output += ")";
		return output;
	}

}

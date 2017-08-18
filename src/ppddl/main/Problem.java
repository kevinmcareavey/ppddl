package ppddl.main;

import ppddl.exception.NameException;
import ppddl.exception.RequirementsException;
import ppddl.main.typedlist.Objects;

public class Problem implements Requires {
	
	private Name name;
	private Name domain;
	private Requirements requireDef;
	private Objects objectsDef;
	private Init init;
	private Goal goal;
	
	public Problem(Name name, Name domain) {
		this.setName(name);
		this.setDomain(domain);
		this.setRequireDef(new Requirements());
		this.setObjectsDef(new Objects());
		this.setInit(new Init());
		this.setGoal(null);
	}
	
	public Problem(String name, String domain) throws NameException {
		this(new Name(name), new Name(domain));
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
	
	public Requirements getRequireDef() {
		return requireDef;
	}
	
	public void setRequireDef(Requirements requireDef) {
		this.requireDef = requireDef;
	}
	
	public Objects getObjectsDef() {
		return objectsDef;
	}
	
	public void setObjectsDef(Objects objectsDef) {
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
	public void validate(Requirements requireDef) throws RequirementsException {
		this.getObjectsDef().validate(requireDef);
		this.getInit().validate(requireDef);
		this.getGoal().validate(requireDef);
	}
	
	public void validate() throws RequirementsException {
		this.validate(this.getRequireDef());
	}

	@Override
	public String toString() {
		String output = "(define (problem " + name + ")";
		output += "\n\t(:domain " + this.getDomain() + ")";
		output += "\n\t" + this.getRequireDef();
		if(!this.getObjectsDef().isEmpty()) {
			output += "\n\t" + this.getObjectsDef();
		}
		if(!this.getInit().isEmpty()) {
			output += "\n\t" + this.getInit();
		}
		if(this.getGoal() != null) {
			output += "\n\t" + this.getGoal();
		}
		output += ")\n";
		return output;
	}

}

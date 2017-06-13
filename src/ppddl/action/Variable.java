package ppddl.action;

import ppddl.Name;

public class Variable extends Term {
	
	private Name name;

	public Variable(String symbol) {
		this.setName(new Name(symbol));
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "?" + this.getName().toString();
	}
	
}

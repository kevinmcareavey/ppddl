package ppddl.term;

import ppddl.Name;
import ppddl.Term;
import ppddl.Typable;

public class Variable extends Term implements Typable {
	
	private Name name;

	public Variable(Name name) {
		this.setName(name);
	}
	
	public Variable(String symbol) throws Exception {
		this.setName(new Name(symbol));
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}
	
	@Override
	public boolean isGround() {
		return false;
	}

	@Override
	public String toString() {
		return "?" + this.getName().toString();
	}
	
}

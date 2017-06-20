package ppddl.term;

import ppddl.Name;
import ppddl.Term;
import ppddl.Typable;

public class Constant extends Term implements Typable {
	
	private Name name;

	public Constant(Name name) {
		this.setName(name);
	}
	
	public Constant(String symbol) throws Exception {
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
		return true;
	}

	@Override
	public String toString() {
		return this.getName().toString();
	}
	
}

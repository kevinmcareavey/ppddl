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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Constant other = (Constant) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

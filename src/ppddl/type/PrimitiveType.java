package ppddl.type;

import ppddl.Name;
import ppddl.Typable;
import ppddl.Type;

public class PrimitiveType extends Type implements Typable {

	private Name name;

	public PrimitiveType(Name name) {
		this.setName(name);
	}
	
	public PrimitiveType(String symbol) {
		this(new Name(symbol));
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.getName().toString();
	}

}

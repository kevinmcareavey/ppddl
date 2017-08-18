package ppddl.main.type;

import ppddl.exception.NameException;
import ppddl.main.Name;
import ppddl.main.Typable;
import ppddl.main.Type;

public class SimpleType extends Type implements Typable {
	
	public static final SimpleType OBJECT;
	public static final SimpleType NUMBER;
	
	static {
	    try {
	    	OBJECT = new SimpleType("object");
	    	NUMBER = new SimpleType("number");
	    } catch(NameException e) {
	    	throw new ExceptionInInitializerError("error creating global primitive types");
	    }
    }

	private Name name;

	public SimpleType(Name name) {
		this.setName(name);
	}
	
	public SimpleType(String symbol) throws NameException {
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
		SimpleType other = (SimpleType) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

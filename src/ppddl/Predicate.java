package ppddl;

public class Predicate {

	private Name name;

	public Predicate(Name name) {
		this.setName(name);
	}
	
	public Predicate(String symbol) {
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
		return this.getName().toString();
	}

}

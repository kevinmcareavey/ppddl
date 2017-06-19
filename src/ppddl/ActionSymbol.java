package ppddl;

public class ActionSymbol {

	private Name name;

	public ActionSymbol(Name name) {
		this.setName(name);
	}
	
	public ActionSymbol(String symbol) {
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

package ppddl;

public class FunctionSymbol {

	private Name name;

	public FunctionSymbol(Name name) {
		this.setName(name);
	}
	
	public FunctionSymbol(String symbol) {
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

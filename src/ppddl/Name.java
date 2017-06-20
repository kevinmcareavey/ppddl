package ppddl;

public class Name {
	
	private String symbol;
	
	public Name(String symbol) throws Exception {
		this.setSymbol(symbol);
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) throws Exception {
		String regex = "[a-zA-Z][a-zA-Z0-9_-]*";
		if(!symbol.matches(regex)) {
			throw new Exception("names must start with an alphabetic character, followed by a (possibly empty) sequence of alphanumeric characters, hypens, and underscores");
		}
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return this.getSymbol();
	}
	
}

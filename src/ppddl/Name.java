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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
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
		Name other = (Name) obj;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}
	
}

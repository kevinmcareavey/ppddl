package ppddl;

import ppddl.action.Term;

public class Name extends Term {
	
	private String symbol;
	
	public Name(String symbol) {
		this.setSymbol(symbol);
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return this.getSymbol();
	}
	
}
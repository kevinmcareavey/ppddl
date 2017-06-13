package ppddl.formula;

import java.util.List;

import ppddl.Formula;

public abstract class Nary<T> extends Formula {
	
	private List<T> arguments;
	
	public Nary(List<T> list) {
		this.setArguments(list);
	}

	public List<T> getArguments() {
		return arguments;
	}

	public void setArguments(List<T> arguments) {
		this.arguments = arguments;
	}
	
	public abstract String getSymbol();

	@Override
	public String toString() {
		String output = "(" + this.getSymbol();
		for(T t : this.getArguments()) {
			output += " " + t.toString();
		}
		output += ")";
		return output;
	}
	
}

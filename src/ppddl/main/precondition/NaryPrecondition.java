package ppddl.main.precondition;

import java.util.ArrayList;
import java.util.List;

import ppddl.main.Precondition;

public abstract class NaryPrecondition<T> extends Precondition {
	
	private List<T> children;
	
	public NaryPrecondition(List<T> arguments) {
		this.setChildren(arguments);
	}
	
	@SafeVarargs
	public NaryPrecondition(T... arguments) {
		List<T> list = new ArrayList<T>();
		for(int i = 0; i < arguments.length; i++) {
			list.add(arguments[i]);
		}
		this.setChildren(list);
	}

	public List<T> getChildren() {
		return children;
	}

	public void setChildren(List<T> arguments) {
		this.children = arguments;
	}
	
	public abstract String getSymbol();

	@Override
	public String toString() {
		String output = "(" + this.getSymbol();
		for(T t : this.getChildren()) {
			output += " " + t.toString();
		}
		output += ")";
		return output;
	}
	
}

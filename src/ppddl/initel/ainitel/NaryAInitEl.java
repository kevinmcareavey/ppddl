package ppddl.initel.ainitel;

import java.util.ArrayList;
import java.util.List;

import ppddl.initel.AInitEl;

public abstract class NaryAInitEl<T> extends AInitEl {
	
	private List<T> children;
	
	public NaryAInitEl(List<T> child) {
		this.setChildren(child);
	}
	
	@SafeVarargs
	public NaryAInitEl(T... arguments) {
		List<T> list = new ArrayList<T>();
		for(int i = 0; i < arguments.length; i++) {
			list.add(arguments[i]);
		}
		this.setChildren(list);
	}

	public List<T> getChildren() {
		return children;
	}

	public void setChildren(List<T> children) {
		this.children = children;
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

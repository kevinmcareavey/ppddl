package ppddl.initel;

import java.util.ArrayList;
import java.util.List;

import ppddl.InitEl;

public abstract class NaryInitEl<T> extends InitEl {
	
	private List<T> children;
	
	public NaryInitEl(List<T> child) {
		this.setChildren(child);
	}
	
	@SafeVarargs
	public NaryInitEl(T... arguments) {
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

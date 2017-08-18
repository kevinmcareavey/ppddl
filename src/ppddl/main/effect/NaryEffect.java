package ppddl.main.effect;

import java.util.ArrayList;
import java.util.List;

import ppddl.main.Effect;

public abstract class NaryEffect<T> extends Effect {
	
	private List<T> children;
	
	public NaryEffect(List<T> arguments) {
		this.setChildren(arguments);
	}
	
	@SafeVarargs
	public NaryEffect(T... arguments) {
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

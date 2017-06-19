package ppddl.myeffect.effect.formula;

import java.util.ArrayList;
import java.util.List;

import ppddl.MyEffect;
import ppddl.myeffect.effect.Formula;

public abstract class Nary<T extends MyEffect> extends Formula {
	
	private List<T> children;
	
	public Nary(List<T> arguments) {
		this.setChildren(arguments);
	}
	
	@SafeVarargs
	public Nary(T... arguments) {
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

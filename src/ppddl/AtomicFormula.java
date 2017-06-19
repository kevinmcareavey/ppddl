package ppddl;

import java.util.ArrayList;
import java.util.List;

public class AtomicFormula<T extends Term> {
	
	private Predicate predicate;
	private List<T> arguments;
	
	public AtomicFormula(Predicate predicate, List<T> arguments) {
		this.setPredicate(predicate);
		this.setArguments(arguments);
	}
	
	@SafeVarargs
	public AtomicFormula(Predicate predicate, T... arguments) {
		this.setPredicate(predicate);
		List<T> list = new ArrayList<T>();
		for(int i = 0; i < arguments.length; i++) {
			list.add(arguments[i]);
		}
		this.setArguments(list);
	}
	
	public AtomicFormula(Predicate predicate) {
		this(predicate, new ArrayList<T>());
	}

	public Predicate getPredicate() {
		return predicate;
	}

	public void setPredicate(Predicate predicate) {
		this.predicate = predicate;
	}

	public List<T> getArguments() {
		return arguments;
	}

	public void setArguments(List<T> arguments) {
		this.arguments = arguments;
	}
	
	@Override
	public String toString() {
		if(this.getArguments().isEmpty()) {
			return this.getPredicate().toString();
		} else {
			String output = "(" + this.getPredicate().toString();
			for(T t : this.getArguments()) {
				output += " " + t.toString();
			}
			output += ")";
			return output;
		}
	}
	
}

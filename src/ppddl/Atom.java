package ppddl;

import java.util.ArrayList;
import java.util.List;

import ppddl.name.Predicate;

public class Atom {
	
	private Predicate predicate;
	private List<Term> arguments;
	
	public Atom(Predicate predicate, List<Term> arguments) {
		this.setPredicate(predicate);
		this.setArguments(arguments);
	}
	
	@SafeVarargs
	public Atom(Predicate predicate, Term... arguments) throws Exception {
		this.setPredicate(predicate);
		List<Term> list = new ArrayList<Term>();
		for(int i = 0; i < arguments.length; i++) {
			list.add(arguments[i]);
		}
		this.setArguments(list);
	}
	
	public Atom(Predicate predicate) {
		this(predicate, new ArrayList<Term>());
	}

	public Predicate getPredicate() {
		return predicate;
	}

	public void setPredicate(Predicate predicate) {
		this.predicate = predicate;
	}
	
	public List<Term> getArguments() {
		return arguments;
	}

	public void setArguments(List<Term> arguments) {
		this.arguments = arguments;
	}
	
	@Override
	public String toString() {
		if(this.getArguments().isEmpty()) {
			return this.getPredicate().toString();
		} else {
			String output = "(" + this.getPredicate().toString();
			for(Term term : this.getArguments()) {
				output += " " + term.toString();
			}
			output += ")";
			return output;
		}
	}
	
}

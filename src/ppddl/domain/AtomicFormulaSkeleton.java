package ppddl.domain;

import ppddl.action.Variable;

public class AtomicFormulaSkeleton {
	
	private Predicate predicate;
	private TypedList<Variable> variables;
	
	public AtomicFormulaSkeleton(Predicate predicate, TypedList<Variable> variables) {
		this.setPredicate(predicate);
		this.setVariables(variables);
	}

	public Predicate getPredicate() {
		return predicate;
	}

	public void setPredicate(Predicate predicate) {
		this.predicate = predicate;
	}

	public TypedList<Variable> getVariables() {
		return variables;
	}

	public void setVariables(TypedList<Variable> variables) {
		this.variables = variables;
	}
	
	@Override
	public String toString() {
		return "(" + predicate.toString() + " " + variables.toString() + ")";
	}
	
}

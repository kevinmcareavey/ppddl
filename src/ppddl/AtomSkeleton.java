package ppddl;

import ppddl.name.Predicate;
import ppddl.term.Variable;

public class AtomSkeleton implements Requires {
	
	private Predicate predicate;
	private TypedList<Variable> variables;
	
	public AtomSkeleton(Predicate predicate, TypedList<Variable> variables) {
		this.setPredicate(predicate);
		this.setVariables(variables);
	}
	
	public AtomSkeleton(Predicate predicate) {
		this.setPredicate(predicate);
		this.setVariables(new TypedList<Variable>());
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
	public void validate(Requirements requireDef) throws Exception {
		this.getVariables().validate(requireDef);
	}
	
	@Override
	public String toString() {
		String output = "(" + this.getPredicate().toString();
		if(!this.getVariables().isEmpty()) {
			output += " " + this.getVariables().toString();
		}
		output += ")";
		return output;
	}
	
}

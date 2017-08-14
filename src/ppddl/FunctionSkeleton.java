package ppddl;

import ppddl.name.FunctionSymbol;
import ppddl.term.Variable;

public class FunctionSkeleton implements Requires {
	
	private FunctionSymbol functionSymbol;
	private TypedList<Variable> variables;
	
	public FunctionSkeleton(FunctionSymbol functionSymbol, TypedList<Variable> variables) {
		this.setFunctionSymbol(functionSymbol);
		this.setVariables(variables);
	}
	
	public FunctionSkeleton(FunctionSymbol functionSymbol) {
		this.setFunctionSymbol(functionSymbol);
		this.setVariables(new TypedList<Variable>());
	}

	public FunctionSymbol getFunctionSymbol() {
		return functionSymbol;
	}

	public void setFunctionSymbol(FunctionSymbol functionSymbol) {
		this.functionSymbol = functionSymbol;
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
		String output = "(" + this.getFunctionSymbol().toString();
		if(!this.getVariables().isEmpty()) {
			output += " " + this.getVariables().toString();
		}
		output += ")";
		return output;
	}
	
}

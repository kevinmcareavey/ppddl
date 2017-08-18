package ppddl.main;

import ppddl.exception.NameException;
import ppddl.exception.RequirementsException;
import ppddl.main.name.FunctionSymbol;
import ppddl.main.term.Variable;

public class FunctionSkeleton implements Requires {
	
	private FunctionSymbol functionSymbol;
	private TypedList<Variable> variables;
	
	public FunctionSkeleton(FunctionSymbol functionSymbol, TypedList<Variable> variables) {
		this.setFunctionSymbol(functionSymbol);
		this.setVariables(variables);
	}
	
	public FunctionSkeleton(FunctionSymbol functionSymbol) {
		this(functionSymbol, new TypedList<Variable>());
	}
	
	public FunctionSkeleton(String functionSymbol) throws NameException {
		this(new FunctionSymbol(functionSymbol));
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
	public void validate(Requirements requireDef) throws RequirementsException {
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

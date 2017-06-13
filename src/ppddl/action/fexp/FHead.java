package ppddl.action.fexp;

import java.util.ArrayList;
import java.util.List;

import ppddl.action.FExp;
import ppddl.domain.FunctionSymbol;

public class FHead<T> extends FExp {
	
	private FunctionSymbol functionSymbol;
	private List<T> arguments;
	
	public FHead(FunctionSymbol functionSymbol, List<T> arguments) {
		this.setFunctionSymbol(functionSymbol);
		this.setArguments(arguments);
	}
	
	public FHead(FunctionSymbol functionSymbol) {
		this(functionSymbol, new ArrayList<T>());
	}

	public FunctionSymbol getFunctionSymbol() {
		return functionSymbol;
	}

	public void setFunctionSymbol(FunctionSymbol functionSymbol) {
		this.functionSymbol = functionSymbol;
	}

	public List<T> getArguments() {
		return arguments;
	}

	public void setArguments(List<T> arguments) {
		this.arguments = arguments;
	}
	
	@Override
	public String toString() {
		if(arguments.isEmpty()) {
			return functionSymbol.toString();
		} else {
			String output = "(" + functionSymbol.toString();
			for(T t : arguments) {
				output += " " + t.toString();
			}
			output += ")";
			return output;
		}
	}
	
}

package ppddl.fexp.function;

import java.util.ArrayList;
import java.util.List;

import ppddl.FunctionSymbol;
import ppddl.Term;
import ppddl.fexp.Function;

public class FHead extends Function {
	
	private List<Term> arguments;
	
	public FHead(FunctionSymbol functionSymbol, List<Term> arguments) throws Exception {
		super(functionSymbol);
		if(arguments.isEmpty()) {
			throw new Exception("function arguments expected");
		}
		this.setArguments(arguments);
	}
	
	@SafeVarargs
	public FHead(FunctionSymbol functionSymbol, Term... arguments) throws Exception {
		super(functionSymbol);
		if(arguments.length == 0) {
			throw new Exception("function arguments expected");
		}
		List<Term> list = new ArrayList<Term>();
		for(int i = 0; i < arguments.length; i++) {
			list.add(arguments[i]);
		}
		this.setArguments(list);
	}

	public List<Term> getArguments() {
		return arguments;
	}

	public void setArguments(List<Term> arguments) {
		this.arguments = arguments;
	}
	
	@Override
	public boolean isGround() {
		for(Term argument : this.getArguments()) {
			if(!argument.isGround()) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		String output = "(" + this.getFunctionSymbol().toString();
		for(Term t : this.getArguments()) {
			output += " " + t.toString();
		}
		output += ")";
		return output;
	}
	
}

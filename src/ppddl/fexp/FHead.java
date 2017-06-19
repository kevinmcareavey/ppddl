package ppddl.fexp;

import java.util.ArrayList;
import java.util.List;

import ppddl.FExp;
import ppddl.FunctionSymbol;
import ppddl.Term;

public class FHead<T extends Term> extends FExp {
	
	public static final FHead<Term> REWARD = new FHead<Term>(new FunctionSymbol("reward"));
	public static final FHead<Term> TOTAL_TIME = new FHead<Term>(new FunctionSymbol("total-time"));
	public static final FHead<Term> GOAL_ACHIEVED = new FHead<Term>(new FunctionSymbol("goal-achieved"));
	
	private FunctionSymbol functionSymbol;
	private List<T> arguments;
	
	public FHead(FunctionSymbol functionSymbol, List<T> arguments) {
		this.setFunctionSymbol(functionSymbol);
		this.setArguments(arguments);
	}
	
	@SafeVarargs
	public FHead(FunctionSymbol functionSymbol, T... arguments) {
		this.setFunctionSymbol(functionSymbol);
		List<T> list = new ArrayList<T>();
		for(int i = 0; i < arguments.length; i++) {
			list.add(arguments[i]);
		}
		this.setArguments(list);
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
		if(this.getArguments().isEmpty()) {
			return functionSymbol.toString();
		} else {
			String output = "(" + this.getFunctionSymbol().toString();
			for(T t : this.getArguments()) {
				output += " " + t.toString();
			}
			output += ")";
			return output;
		}
	}
	
}

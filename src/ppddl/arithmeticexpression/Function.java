package ppddl.arithmeticexpression;

import java.util.ArrayList;
import java.util.List;

import ppddl.ArithmeticExpression;
import ppddl.Term;
import ppddl.name.FunctionSymbol;

public class Function extends ArithmeticExpression {
	
	public static final Function REWARD;
	public static final Function TOTAL_TIME;
	public static final Function GOAL_ACHIEVED;
	
	static {
	    try {
	    	REWARD = new Function(new FunctionSymbol("reward"));
	    	TOTAL_TIME = new Function(new FunctionSymbol("total-time"));
	    	GOAL_ACHIEVED = new Function(new FunctionSymbol("goal-achieved"));
	    } catch(Exception e) {
	    	throw new ExceptionInInitializerError("error creating global functions");
	    }
    }
	
	private FunctionSymbol functionSymbol;
	private List<Term> arguments;
	
	public Function(FunctionSymbol functionSymbol, List<Term> arguments) {
		this.setFunctionSymbol(functionSymbol);
		this.setArguments(arguments);
	}
	
	@SafeVarargs
	public Function(FunctionSymbol functionSymbol, Term... arguments) {
		this.setFunctionSymbol(functionSymbol);
		List<Term> list = new ArrayList<Term>();
		for(int i = 0; i < arguments.length; i++) {
			list.add(arguments[i]);
		}
		this.setArguments(list);
	}
	
	public Function(FunctionSymbol functionSymbol) {
		this(functionSymbol, new ArrayList<Term>());
	}
	
	public FunctionSymbol getFunctionSymbol() {
		return functionSymbol;
	}

	public void setFunctionSymbol(FunctionSymbol functionSymbol) {
		this.functionSymbol = functionSymbol;
	}
	
	public List<Term> getArguments() {
		return arguments;
	}

	public void setArguments(List<Term> arguments) {
		this.arguments = arguments;
	}
	
	@Override
	public boolean isGround() {
		if(this.getArguments().isEmpty()) {
			return true;
		} else {
			for(Term argument : this.getArguments()) {
				if(!argument.isGround()) {
					return false;
				}
			}
			return true;
		}
	}
	
	@Override
	public String toString() {
		if(this.getArguments().isEmpty()) {
			return this.getFunctionSymbol().toString();
		} else {
			String output = "(" + this.getFunctionSymbol().toString();
			for(Term t : this.getArguments()) {
				output += " " + t.toString();
			}
			output += ")";
			return output;
		}
	}

}

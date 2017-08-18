package ppddl.main.arithmetic_expression;

import java.util.ArrayList;
import java.util.List;

import ppddl.exception.NameException;
import ppddl.exception.RequirementsException;
import ppddl.main.ArithmeticExpression;
import ppddl.main.Requirements;
import ppddl.main.Term;
import ppddl.main.name.FunctionSymbol;

public class Function extends ArithmeticExpression {
	
	public static final Function REWARD;
	public static final Function TOTAL_TIME;
	public static final Function GOAL_ACHIEVED;
	
	static {
	    try {
	    	REWARD = new Function(new FunctionSymbol("reward"));
	    	TOTAL_TIME = new Function(new FunctionSymbol("total-time"));
	    	GOAL_ACHIEVED = new Function(new FunctionSymbol("goal-achieved"));
	    } catch(NameException e) {
	    	throw new ExceptionInInitializerError("error creating global functions");
	    }
    }
	
	private FunctionSymbol functionSymbol;
	private List<Term> arguments;
	
	public Function(FunctionSymbol functionSymbol, List<Term> arguments) {
		this.setFunctionSymbol(functionSymbol);
		this.setArguments(arguments);
	}
	
	public Function(String functionSymbol, List<Term> arguments) throws NameException {
		this(new FunctionSymbol(functionSymbol), arguments);
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
	
	public Function(String functionSymbol) throws NameException {
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
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledRewards() && this.equals(Function.REWARD)) {
			throw new RequirementsException("reward goals are defined but :rewards is not required");
		}
	}
	
	@Override
	public boolean constainsReward() {
		return this.equals(Function.REWARD);
	}
	
	@Override
	public String toString() {
		if(this.getArguments().isEmpty()) {
//			return this.getFunctionSymbol().toString();
			return "(" + this.getFunctionSymbol().toString() + ")"; // Required by Metric-FF.
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

package ppddl.arithmeticexpression;

import ppddl.ArithmeticExpression;
import ppddl.FunctionSymbol;

public class Function extends ArithmeticExpression {
	
	public static final Function REWARD = new Function(new FunctionSymbol("reward"));
	public static final Function TOTAL_TIME = new Function(new FunctionSymbol("total-time"));
	public static final Function GOAL_ACHIEVED = new Function(new FunctionSymbol("goal-achieved"));
	
	private FunctionSymbol functionSymbol;
	
	public Function(FunctionSymbol functionSymbol) {
		this.setFunctionSymbol(functionSymbol);
	}
	
	public FunctionSymbol getFunctionSymbol() {
		return functionSymbol;
	}

	public void setFunctionSymbol(FunctionSymbol functionSymbol) {
		this.functionSymbol = functionSymbol;
	}
	
	@Override
	public boolean isGround() {
		return true;
	}
	
	@Override
	public String toString() {
		return this.getFunctionSymbol().toString();
	}

}

package external;

import java.util.ArrayList;
import java.util.List;

import ppddl.Term;
import ppddl.name.ActionSymbol;
import ppddl.term.Constant;

public class Action {
	
	private ActionSymbol actionSymbol;
	private List<Constant> arguments;
	
	public Action(ActionSymbol actionSymbol, List<Constant> arguments) {
		this.setActionSymbol(actionSymbol);
		this.setArguments(arguments);
	}
	
	@SafeVarargs
	public Action(ActionSymbol actionSymbol, Constant... arguments) throws Exception {
		this.setActionSymbol(actionSymbol);
		List<Constant> list = new ArrayList<Constant>();
		for(int i = 0; i < arguments.length; i++) {
			list.add(arguments[i]);
		}
		this.setArguments(list);
	}

	public ActionSymbol getActionSymbol() {
		return actionSymbol;
	}

	public void setActionSymbol(ActionSymbol actionSymbol) {
		this.actionSymbol = actionSymbol;
	}

	public List<Constant> getArguments() {
		return arguments;
	}

	public void setArguments(List<Constant> arguments) {
		this.arguments = arguments;
	}
	
	@Override
	public String toString() {
		if(this.getArguments().isEmpty()) {
			return this.getActionSymbol().toString();
		} else {
			String output = "(" + this.getActionSymbol().toString();
			for(Term term : this.getArguments()) {
				output += " " + term.toString();
			}
			output += ")";
			return output;
		}
	}

}

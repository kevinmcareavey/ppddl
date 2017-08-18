package ppddl.main.initial_formula.deterministic;

import java.util.ArrayList;
import java.util.List;

import ppddl.exception.InitException;
import ppddl.exception.RequirementsException;
import ppddl.main.Requirements;
import ppddl.main.initial_formula.DeterministicInitialFormula;

/*
 * Warning: a ConjunctiveInitial should not be used to instantiate and InitEl object.
 */
public class ConjunctionInitialFormula extends DeterministicInitialFormula {
	
	private List<TerminalDeterministicInitialFormula> children;
	
	public ConjunctionInitialFormula(List<TerminalDeterministicInitialFormula> children) throws InitException {
		if(children.size() < 2) {
			throw new InitException("conjunctive init formulas need at least two children");
		}
		this.setChildren(children);
	}
	
	@SafeVarargs
	public ConjunctionInitialFormula(TerminalDeterministicInitialFormula... children) throws InitException {
		if(children.length < 2) {
			throw new InitException("conjunctive init formulas need at least two children");
		}
		List<TerminalDeterministicInitialFormula> list = new ArrayList<TerminalDeterministicInitialFormula>();
		for(int i = 0; i < children.length; i++) {
			list.add(children[i]);
		}
		this.setChildren(list);
	}

	public List<TerminalDeterministicInitialFormula> getChildren() {
		return children;
	}

	public void setChildren(List<TerminalDeterministicInitialFormula> children) {
		this.children = children;
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		for(TerminalDeterministicInitialFormula terminalDeterministicInitFormula : this.getChildren()) {
			terminalDeterministicInitFormula.validate(requireDef);
		}
	}

	@Override
	public String toString() {
		String output = "(and";
		for(TerminalDeterministicInitialFormula terminalDeterministicInitFormula : this.getChildren()) {
			output += " " + terminalDeterministicInitFormula.toString();
		}
		output += ")";
		return output;
	}

}

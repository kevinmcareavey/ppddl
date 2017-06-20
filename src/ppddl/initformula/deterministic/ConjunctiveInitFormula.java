package ppddl.initformula.deterministic;

import java.util.ArrayList;
import java.util.List;

import ppddl.initformula.DeterministicInitFormula;

/*
 * Warning: a ConjunctiveInitial should not be used to instantiate and InitEl object.
 */
public class ConjunctiveInitFormula extends DeterministicInitFormula {
	
	private List<TerminalDeterministicInitFormula> children;
	
	public ConjunctiveInitFormula(List<TerminalDeterministicInitFormula> children) throws Exception {
		if(children.size() < 2) {
			throw new Exception("conjunctive init formulas need at least two children");
		}
		this.setChildren(children);
	}
	
	@SafeVarargs
	public ConjunctiveInitFormula(TerminalDeterministicInitFormula... children) throws Exception {
		if(children.length < 2) {
			throw new Exception("conjunctive init formulas need at least two children");
		}
		List<TerminalDeterministicInitFormula> list = new ArrayList<TerminalDeterministicInitFormula>();
		for(int i = 0; i < children.length; i++) {
			list.add(children[i]);
		}
		this.setChildren(list);
	}

	public List<TerminalDeterministicInitFormula> getChildren() {
		return children;
	}

	public void setChildren(List<TerminalDeterministicInitFormula> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		String output = "(and";
		for(TerminalDeterministicInitFormula terminalDeterministicInitFormula : this.getChildren()) {
			output += " " + terminalDeterministicInitFormula.toString();
		}
		output += ")";
		return output;
	}

}

package ppddl;

import java.util.ArrayList;

import ppddl.initial_formula.deterministic.ConjunctionInitialFormula;

public class Init extends ArrayList<InitialFormula> implements Requires {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7948006237260975764L;
	
	@Override
	public boolean add(InitialFormula initEl) {
		if(initEl instanceof ConjunctionInitialFormula) {
			try {
				throw new Exception("conjunctive init formulas are only allowed as subformulas of probabilistic init formulas");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return super.add(initEl);
		}
		return false;
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		for(InitialFormula initFormula : this) {
			initFormula.validate(requireDef);
		}
	}

	@Override
	public String toString() {
		String output = "(:init";
		for(InitialFormula initEl : this) {
			output += " " + initEl.toString();
		}
		output += ")";
		return output;
	}

}

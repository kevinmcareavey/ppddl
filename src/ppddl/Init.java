package ppddl;

import java.util.ArrayList;

import ppddl.initformula.deterministic.ConjunctiveInitFormula;

public class Init extends ArrayList<InitFormula> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7948006237260975764L;
	
	@Override
	public boolean add(InitFormula initEl) {
		if(initEl instanceof ConjunctiveInitFormula) {
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
	public String toString() {
		String output = "(:init";
		for(InitFormula initEl : this) {
			output += " " + initEl.toString();
		}
		output += ")";
		return output;
	}

}

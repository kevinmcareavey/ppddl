package ppddl.main;

import ppddl.exception.RequirementsException;

public interface Requires {
	
	/*
	 * typing
	 * equality
	 * negative-preconditions
	 * disjunctive-preconditions
	 * existential-preconditions
	 * universal-preconditions
	 * conditional-effects
	 * probabilistic-effects
	 * rewards
	 * fluents
	 */
	public void validate(Requirements requireDef) throws RequirementsException;

}

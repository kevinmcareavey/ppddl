package ppddl;

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
	public void validate(Requirements requireDef) throws Exception;

}

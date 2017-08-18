package ppddl.main;

public class Requirements {
	
	private boolean strips = false;
	private boolean typing = false;
	private boolean equality = false;
	private boolean negativePreconditions = false;
	private boolean disjunctivePreconditions = false;
	private boolean existentialPreconditions = false;
	private boolean universalPreconditions = false;
	private boolean conditionalEffects = false;
	private boolean probabilisticEffects = false;
	private boolean rewards = false;
	private boolean fluents = false;
	
	public boolean isEnabledSTRIPS() {
		if(this.strips) {
			return true;
		} else if(!this.isEnabledFluents() 
				&& !this.isEnabledTyping() 
				&& !this.isEnabledEquality() 
				&& !this.isEnabledNegativePreconditions() 
				&& !this.isEnabledDisjunctivePreconditions() 
				&& !this.isEnabledExistentialPreconditions() 
				&& !this.isEnabledUniversalPreconditions() 
				&& !this.isEnabledConditionalEffects() 
				&& !this.isEnabledProbabilisticEffects() 
				&& !this.isEnabledRewards()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isEnabledTyping() {
		return this.typing;
	}
	
	public boolean isEnabledEquality() {
		return this.equality;
	}
	
	public boolean isEnabledNegativePreconditions() {
		return this.negativePreconditions;
	}
	
	public boolean isEnabledDisjunctivePreconditions() {
		return this.disjunctivePreconditions;
	}
	
	public boolean isEnabledExistentialPreconditions() {
		return this.existentialPreconditions;
	}
	
	public boolean isEnabledUniversalPreconditions() {
		return this.universalPreconditions;
	}
	
	public boolean isEnabledQuantifiedPreconditions() {
		return this.isEnabledExistentialPreconditions() 
				&& this.isEnabledUniversalPreconditions();
	}
	
	public boolean isEnabledConditionalEffects() {
		return this.conditionalEffects;
	}
	
	public boolean isEnabledProbabilisticEffects() {
		return this.probabilisticEffects;
	}
	
	public boolean isEnabledRewards() {
		return this.rewards;
	}
	
	public boolean isEnabledFluents() {
		return this.fluents;
	}
	
	public boolean isEnabledADL() {
		return this.isEnabledSTRIPS() 
				&& this.isEnabledTyping() 
				&& this.isEnabledEquality() 
				&& this.isEnabledNegativePreconditions() 
				&& this.isEnabledDisjunctivePreconditions() 
				&& this.isEnabledQuantifiedPreconditions() 
				&& this.isEnabledConditionalEffects();
	}
	
	public boolean isEnabledMDP() {
		return this.isEnabledProbabilisticEffects() 
				&& this.isEnabledRewards();
	}
	
	public void enableSTRIPS() {
		this.strips = true;
	}
	
	public void enableTyping() {
		this.typing = true;
	}
	
	public void enableEquality() {
		this.equality = true;
	}
	
	public void enableNegativePreconditions() {
		this.negativePreconditions = true;
	}
	
	public void enableDisjunctivePreconditions() {
		this.disjunctivePreconditions = true;
	}
	
	public void enableExistentialPreconditions() {
		this.existentialPreconditions = true;
	}
	
	public void enableUniversalPreconditions() {
		this.universalPreconditions = true;
	}
	
	public void enableQuantifiedPreconditions() {
		this.enableExistentialPreconditions();
		this.enableUniversalPreconditions();
	}
	
	public void enableConditionalEffects() {
		this.conditionalEffects = true;
	}
	
	public void enableProbabilisticEffects() {
		this.probabilisticEffects = true;
	}
	
	public void enableRewards() {
		this.rewards = true;
	}
	
	public void enableFluents() {
		this.fluents = true;
	}
	
	public void enableADL() {
		this.enableSTRIPS();
		this.enableTyping();
		this.enableEquality();
		this.enableNegativePreconditions();
		this.enableDisjunctivePreconditions();
		this.enableQuantifiedPreconditions();
		this.enableConditionalEffects();
	}
	
	public void enableMDP() {
		this.enableProbabilisticEffects();
		this.enableRewards();
	}

	@Override
	public String toString() {
		String output = "(:requirements";
		if(this.isEnabledSTRIPS() && !this.isEnabledADL()) {
			output += " :strips";
		}
		if(this.isEnabledTyping() && !this.isEnabledADL()) {
			output += " :typing";
		}
		if(this.isEnabledEquality() && !this.isEnabledADL()) {
			output += " :equality";
		}
		if(this.isEnabledNegativePreconditions() && !this.isEnabledADL()) {
			output += " :negative-preconditions";
		}
		if(this.isEnabledDisjunctivePreconditions() && !this.isEnabledADL()) {
			output += " :disjunctive-preconditions";
		}
		if(this.isEnabledExistentialPreconditions() && !this.isEnabledQuantifiedPreconditions()) {
			output += " :existential-preconditions";
		}
		if(this.isEnabledUniversalPreconditions() && !this.isEnabledQuantifiedPreconditions()) {
			output += " :universal-preconditions";
		}
		if(this.isEnabledQuantifiedPreconditions() && !this.isEnabledADL()) {
			output += " :quantified-preconditions";
		}
		if(this.isEnabledConditionalEffects() && !this.isEnabledADL()) {
			output += " :conditional-effects";
		}
		if(this.isEnabledProbabilisticEffects() && !this.isEnabledMDP()) {
			output += " :probabilistic-effects";
		}
		if(this.isEnabledRewards() && !this.isEnabledMDP()) {
			output += " :rewards";
		}
		if(this.isEnabledFluents()) {
			output += " :fluents";
		}
		if(this.isEnabledADL()) {
			output += " :adl";
		}
		if(this.isEnabledMDP()) {
			output += " :mdp";
		}
		output += ")";
		return output;
	}
	
}

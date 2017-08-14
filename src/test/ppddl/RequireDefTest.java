package test.ppddl;

import static org.junit.Assert.*;

import org.junit.Test;

import ppddl.Requirements;

public class RequireDefTest {

	@Test
	public void strips() {
		Requirements requireDef = new Requirements();
		
		assertEquals(true, requireDef.isEnabledSTRIPS());
		assertEquals(false, requireDef.isEnabledTyping());
		assertEquals(false, requireDef.isEnabledEquality());
		assertEquals(false, requireDef.isEnabledNegativePreconditions());
		assertEquals(false, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(false, requireDef.isEnabledExistentialPreconditions());
		assertEquals(false, requireDef.isEnabledUniversalPreconditions());
		assertEquals(false, requireDef.isEnabledConditionalEffects());
		assertEquals(false, requireDef.isEnabledProbabilisticEffects());
		assertEquals(false, requireDef.isEnabledRewards());
		assertEquals(false, requireDef.isEnabledFluents());
		assertEquals(false, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(false, requireDef.isEnabledADL());
		assertEquals(false, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :strips)", requireDef.toString());
	}
	
	@Test
	public void typing() {
		Requirements requireDef = new Requirements();
		requireDef.enableTyping();
		
		assertEquals(false, requireDef.isEnabledSTRIPS());
		assertEquals(true, requireDef.isEnabledTyping());
		assertEquals(false, requireDef.isEnabledEquality());
		assertEquals(false, requireDef.isEnabledNegativePreconditions());
		assertEquals(false, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(false, requireDef.isEnabledExistentialPreconditions());
		assertEquals(false, requireDef.isEnabledUniversalPreconditions());
		assertEquals(false, requireDef.isEnabledConditionalEffects());
		assertEquals(false, requireDef.isEnabledProbabilisticEffects());
		assertEquals(false, requireDef.isEnabledRewards());
		assertEquals(false, requireDef.isEnabledFluents());
		assertEquals(false, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(false, requireDef.isEnabledADL());
		assertEquals(false, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :typing)", requireDef.toString());
	}
	
	@Test
	public void equality() {
		Requirements requireDef = new Requirements();
		requireDef.enableEquality();
		
		assertEquals(false, requireDef.isEnabledSTRIPS());
		assertEquals(false, requireDef.isEnabledTyping());
		assertEquals(true, requireDef.isEnabledEquality());
		assertEquals(false, requireDef.isEnabledNegativePreconditions());
		assertEquals(false, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(false, requireDef.isEnabledExistentialPreconditions());
		assertEquals(false, requireDef.isEnabledUniversalPreconditions());
		assertEquals(false, requireDef.isEnabledConditionalEffects());
		assertEquals(false, requireDef.isEnabledProbabilisticEffects());
		assertEquals(false, requireDef.isEnabledRewards());
		assertEquals(false, requireDef.isEnabledFluents());
		assertEquals(false, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(false, requireDef.isEnabledADL());
		assertEquals(false, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :equality)", requireDef.toString());
	}
	
	@Test
	public void negativePreconditions() {
		Requirements requireDef = new Requirements();
		requireDef.enableNegativePreconditions();
		
		assertEquals(false, requireDef.isEnabledSTRIPS());
		assertEquals(false, requireDef.isEnabledTyping());
		assertEquals(false, requireDef.isEnabledEquality());
		assertEquals(true, requireDef.isEnabledNegativePreconditions());
		assertEquals(false, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(false, requireDef.isEnabledExistentialPreconditions());
		assertEquals(false, requireDef.isEnabledUniversalPreconditions());
		assertEquals(false, requireDef.isEnabledConditionalEffects());
		assertEquals(false, requireDef.isEnabledProbabilisticEffects());
		assertEquals(false, requireDef.isEnabledRewards());
		assertEquals(false, requireDef.isEnabledFluents());
		assertEquals(false, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(false, requireDef.isEnabledADL());
		assertEquals(false, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :negative-preconditions)", requireDef.toString());
	}
	
	@Test
	public void disjunctivePreconditions() {
		Requirements requireDef = new Requirements();
		requireDef.enableDisjunctivePreconditions();
		
		assertEquals(false, requireDef.isEnabledSTRIPS());
		assertEquals(false, requireDef.isEnabledTyping());
		assertEquals(false, requireDef.isEnabledEquality());
		assertEquals(false, requireDef.isEnabledNegativePreconditions());
		assertEquals(true, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(false, requireDef.isEnabledExistentialPreconditions());
		assertEquals(false, requireDef.isEnabledUniversalPreconditions());
		assertEquals(false, requireDef.isEnabledConditionalEffects());
		assertEquals(false, requireDef.isEnabledProbabilisticEffects());
		assertEquals(false, requireDef.isEnabledRewards());
		assertEquals(false, requireDef.isEnabledFluents());
		assertEquals(false, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(false, requireDef.isEnabledADL());
		assertEquals(false, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :disjunctive-preconditions)", requireDef.toString());
	}
	
	@Test
	public void existentialPreconditions() {
		Requirements requireDef = new Requirements();
		requireDef.enableExistentialPreconditions();
		
		assertEquals(false, requireDef.isEnabledSTRIPS());
		assertEquals(false, requireDef.isEnabledTyping());
		assertEquals(false, requireDef.isEnabledEquality());
		assertEquals(false, requireDef.isEnabledNegativePreconditions());
		assertEquals(false, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(true, requireDef.isEnabledExistentialPreconditions());
		assertEquals(false, requireDef.isEnabledUniversalPreconditions());
		assertEquals(false, requireDef.isEnabledConditionalEffects());
		assertEquals(false, requireDef.isEnabledProbabilisticEffects());
		assertEquals(false, requireDef.isEnabledRewards());
		assertEquals(false, requireDef.isEnabledFluents());
		assertEquals(false, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(false, requireDef.isEnabledADL());
		assertEquals(false, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :existential-preconditions)", requireDef.toString());
	}
	
	@Test
	public void universalPreconditions() {
		Requirements requireDef = new Requirements();
		requireDef.enableUniversalPreconditions();
		
		assertEquals(false, requireDef.isEnabledSTRIPS());
		assertEquals(false, requireDef.isEnabledTyping());
		assertEquals(false, requireDef.isEnabledEquality());
		assertEquals(false, requireDef.isEnabledNegativePreconditions());
		assertEquals(false, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(false, requireDef.isEnabledExistentialPreconditions());
		assertEquals(true, requireDef.isEnabledUniversalPreconditions());
		assertEquals(false, requireDef.isEnabledConditionalEffects());
		assertEquals(false, requireDef.isEnabledProbabilisticEffects());
		assertEquals(false, requireDef.isEnabledRewards());
		assertEquals(false, requireDef.isEnabledFluents());
		assertEquals(false, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(false, requireDef.isEnabledADL());
		assertEquals(false, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :universal-preconditions)", requireDef.toString());
	}
	
	@Test
	public void conditionalEffects() {
		Requirements requireDef = new Requirements();
		requireDef.enableConditionalEffects();
		
		assertEquals(false, requireDef.isEnabledSTRIPS());
		assertEquals(false, requireDef.isEnabledTyping());
		assertEquals(false, requireDef.isEnabledEquality());
		assertEquals(false, requireDef.isEnabledNegativePreconditions());
		assertEquals(false, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(false, requireDef.isEnabledExistentialPreconditions());
		assertEquals(false, requireDef.isEnabledUniversalPreconditions());
		assertEquals(true, requireDef.isEnabledConditionalEffects());
		assertEquals(false, requireDef.isEnabledProbabilisticEffects());
		assertEquals(false, requireDef.isEnabledRewards());
		assertEquals(false, requireDef.isEnabledFluents());
		assertEquals(false, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(false, requireDef.isEnabledADL());
		assertEquals(false, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :conditional-effects)", requireDef.toString());
	}
	
	@Test
	public void probabilisticEffects() {
		Requirements requireDef = new Requirements();
		requireDef.enableProbabilisticEffects();
		
		assertEquals(false, requireDef.isEnabledSTRIPS());
		assertEquals(false, requireDef.isEnabledTyping());
		assertEquals(false, requireDef.isEnabledEquality());
		assertEquals(false, requireDef.isEnabledNegativePreconditions());
		assertEquals(false, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(false, requireDef.isEnabledExistentialPreconditions());
		assertEquals(false, requireDef.isEnabledUniversalPreconditions());
		assertEquals(false, requireDef.isEnabledConditionalEffects());
		assertEquals(true, requireDef.isEnabledProbabilisticEffects());
		assertEquals(false, requireDef.isEnabledRewards());
		assertEquals(false, requireDef.isEnabledFluents());
		assertEquals(false, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(false, requireDef.isEnabledADL());
		assertEquals(false, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :probabilistic-effects)", requireDef.toString());
	}
	
	@Test
	public void rewards() {
		Requirements requireDef = new Requirements();
		requireDef.enableRewards();
		
		assertEquals(false, requireDef.isEnabledSTRIPS());
		assertEquals(false, requireDef.isEnabledTyping());
		assertEquals(false, requireDef.isEnabledEquality());
		assertEquals(false, requireDef.isEnabledNegativePreconditions());
		assertEquals(false, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(false, requireDef.isEnabledExistentialPreconditions());
		assertEquals(false, requireDef.isEnabledUniversalPreconditions());
		assertEquals(false, requireDef.isEnabledConditionalEffects());
		assertEquals(false, requireDef.isEnabledProbabilisticEffects());
		assertEquals(true, requireDef.isEnabledRewards());
		assertEquals(false, requireDef.isEnabledFluents());
		assertEquals(false, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(false, requireDef.isEnabledADL());
		assertEquals(false, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :rewards)", requireDef.toString());
	}
	
	@Test
	public void fluents() {
		Requirements requireDef = new Requirements();
		requireDef.enableFluents();
		
		assertEquals(false, requireDef.isEnabledSTRIPS());
		assertEquals(false, requireDef.isEnabledTyping());
		assertEquals(false, requireDef.isEnabledEquality());
		assertEquals(false, requireDef.isEnabledNegativePreconditions());
		assertEquals(false, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(false, requireDef.isEnabledExistentialPreconditions());
		assertEquals(false, requireDef.isEnabledUniversalPreconditions());
		assertEquals(false, requireDef.isEnabledConditionalEffects());
		assertEquals(false, requireDef.isEnabledProbabilisticEffects());
		assertEquals(false, requireDef.isEnabledRewards());
		assertEquals(true, requireDef.isEnabledFluents());
		assertEquals(false, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(false, requireDef.isEnabledADL());
		assertEquals(false, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :fluents)", requireDef.toString());
	}
	
	@Test
	public void quantifiedPreconditions() {
		Requirements requireDef = new Requirements();
		requireDef.enableQuantifiedPreconditions();
		
		assertEquals(false, requireDef.isEnabledSTRIPS());
		assertEquals(false, requireDef.isEnabledTyping());
		assertEquals(false, requireDef.isEnabledEquality());
		assertEquals(false, requireDef.isEnabledNegativePreconditions());
		assertEquals(false, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(true, requireDef.isEnabledExistentialPreconditions());
		assertEquals(true, requireDef.isEnabledUniversalPreconditions());
		assertEquals(false, requireDef.isEnabledConditionalEffects());
		assertEquals(false, requireDef.isEnabledProbabilisticEffects());
		assertEquals(false, requireDef.isEnabledRewards());
		assertEquals(false, requireDef.isEnabledFluents());
		assertEquals(true, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(false, requireDef.isEnabledADL());
		assertEquals(false, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :quantified-preconditions)", requireDef.toString());
	}
	
	@Test
	public void adl() {
		Requirements requireDef = new Requirements();
		requireDef.enableADL();
		
		assertEquals(true, requireDef.isEnabledSTRIPS());
		assertEquals(true, requireDef.isEnabledTyping());
		assertEquals(true, requireDef.isEnabledEquality());
		assertEquals(true, requireDef.isEnabledNegativePreconditions());
		assertEquals(true, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(true, requireDef.isEnabledExistentialPreconditions());
		assertEquals(true, requireDef.isEnabledUniversalPreconditions());
		assertEquals(true, requireDef.isEnabledConditionalEffects());
		assertEquals(false, requireDef.isEnabledProbabilisticEffects());
		assertEquals(false, requireDef.isEnabledRewards());
		assertEquals(false, requireDef.isEnabledFluents());
		assertEquals(true, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(true, requireDef.isEnabledADL());
		assertEquals(false, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :adl)", requireDef.toString());
	}
	
	@Test
	public void mdp() {
		Requirements requireDef = new Requirements();
		requireDef.enableMDP();
		
		assertEquals(false, requireDef.isEnabledSTRIPS());
		assertEquals(false, requireDef.isEnabledTyping());
		assertEquals(false, requireDef.isEnabledEquality());
		assertEquals(false, requireDef.isEnabledNegativePreconditions());
		assertEquals(false, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(false, requireDef.isEnabledExistentialPreconditions());
		assertEquals(false, requireDef.isEnabledUniversalPreconditions());
		assertEquals(false, requireDef.isEnabledConditionalEffects());
		assertEquals(true, requireDef.isEnabledProbabilisticEffects());
		assertEquals(true, requireDef.isEnabledRewards());
		assertEquals(false, requireDef.isEnabledFluents());
		assertEquals(false, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(false, requireDef.isEnabledADL());
		assertEquals(true, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :mdp)", requireDef.toString());
	}
	
	@Test
	public void allPrimitive() {
		Requirements requireDef = new Requirements();
		requireDef.enableSTRIPS();
		requireDef.enableTyping();
		requireDef.enableEquality();
		requireDef.enableNegativePreconditions();
		requireDef.enableDisjunctivePreconditions();
		requireDef.enableExistentialPreconditions();
		requireDef.enableUniversalPreconditions();
		requireDef.enableConditionalEffects();
		requireDef.enableProbabilisticEffects();
		requireDef.enableRewards();
		requireDef.enableFluents();
		
		assertEquals(true, requireDef.isEnabledSTRIPS());
		assertEquals(true, requireDef.isEnabledTyping());
		assertEquals(true, requireDef.isEnabledEquality());
		assertEquals(true, requireDef.isEnabledNegativePreconditions());
		assertEquals(true, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(true, requireDef.isEnabledExistentialPreconditions());
		assertEquals(true, requireDef.isEnabledUniversalPreconditions());
		assertEquals(true, requireDef.isEnabledConditionalEffects());
		assertEquals(true, requireDef.isEnabledProbabilisticEffects());
		assertEquals(true, requireDef.isEnabledRewards());
		assertEquals(true, requireDef.isEnabledFluents());
		assertEquals(true, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(true, requireDef.isEnabledADL());
		assertEquals(true, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :fluents :adl :mdp)", requireDef.toString());
	}
	
	@Test
	public void allComposite() {
		Requirements requireDef = new Requirements();
		requireDef.enableFluents();
		requireDef.enableADL();
		requireDef.enableMDP();
		
		assertEquals(true, requireDef.isEnabledSTRIPS());
		assertEquals(true, requireDef.isEnabledTyping());
		assertEquals(true, requireDef.isEnabledEquality());
		assertEquals(true, requireDef.isEnabledNegativePreconditions());
		assertEquals(true, requireDef.isEnabledDisjunctivePreconditions());
		assertEquals(true, requireDef.isEnabledExistentialPreconditions());
		assertEquals(true, requireDef.isEnabledUniversalPreconditions());
		assertEquals(true, requireDef.isEnabledConditionalEffects());
		assertEquals(true, requireDef.isEnabledProbabilisticEffects());
		assertEquals(true, requireDef.isEnabledRewards());
		assertEquals(true, requireDef.isEnabledFluents());
		assertEquals(true, requireDef.isEnabledQuantifiedPreconditions());
		assertEquals(true, requireDef.isEnabledADL());
		assertEquals(true, requireDef.isEnabledMDP());
		
		assertEquals("(:requirements :fluents :adl :mdp)", requireDef.toString());
	}

}

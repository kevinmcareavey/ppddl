package ppddl.main.initial_formula;

import java.util.ArrayList;
import java.util.List;

import ppddl.exception.InitException;
import ppddl.exception.ProbabilityException;
import ppddl.exception.RequirementsException;
import ppddl.main.InitialFormula;
import ppddl.main.Requirements;
import ppddl.main.annotation.AnnotatedInitialFormula;

public class ProbabilisticInitialFormula extends InitialFormula {
	
	private List<AnnotatedInitialFormula> children;
	
	public ProbabilisticInitialFormula(List<AnnotatedInitialFormula> children) throws InitException, ProbabilityException {
		if(children.size() < 2) {
			throw new InitException("probabilistic init formulas need at least two children");
		}
		this.setChildren(children);
		this.validate();
	}
	
	@SafeVarargs
	public ProbabilisticInitialFormula(AnnotatedInitialFormula... children) throws InitException, ProbabilityException {
		if(children.length < 2) {
			throw new InitException("probabilistic init formulas need at least two children");
		}
		List<AnnotatedInitialFormula> list = new ArrayList<AnnotatedInitialFormula>();
		for(int i = 0; i < children.length; i++) {
			list.add(children[i]);
		}
		this.setChildren(list);
		this.validate();
	}

	public List<AnnotatedInitialFormula> getChildren() {
		return children;
	}

	public void setChildren(List<AnnotatedInitialFormula> children) {
		this.children = children;
	}
	
	public void validate() throws ProbabilityException {
		double sum = 0;
		for(AnnotatedInitialFormula probEffect : this.getChildren()) {
			sum += probEffect.getProbability().getNumber().doubleValue();
		}
		if(sum > 1) {
			throw new ProbabilityException("sum of probabilities is greater than 1");
		}
	}
	
	@Override
	public void validate(Requirements requireDef) throws RequirementsException {
		if(!requireDef.isEnabledProbabilisticEffects()) {
			throw new RequirementsException("probabilistic init formulas are defined but :probabilistic-effects is not required");
		}
		for(AnnotatedInitialFormula annotatedInitFormula : this.getChildren()) {
			annotatedInitFormula.getChild().validate(requireDef);
		}
	}

	@Override
	public String toString() {
		String output = "(probabilistic";
		for(AnnotatedInitialFormula annotatedInitial : this.getChildren()) {
			output += " " + annotatedInitial.toString();
		}
		output += ")";
		return output;
	}

}

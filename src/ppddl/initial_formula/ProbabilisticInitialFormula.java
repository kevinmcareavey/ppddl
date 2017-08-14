package ppddl.initial_formula;

import java.util.ArrayList;
import java.util.List;

import ppddl.InitialFormula;
import ppddl.Requirements;
import ppddl.annotation.AnnotatedInitialFormula;

public class ProbabilisticInitialFormula extends InitialFormula {
	
	private List<AnnotatedInitialFormula> children;
	
	public ProbabilisticInitialFormula(List<AnnotatedInitialFormula> children) throws Exception {
		if(children.size() < 2) {
			throw new Exception("probabilistic init formulas need at least two children");
		}
		this.setChildren(children);
		this.validate();
	}
	
	@SafeVarargs
	public ProbabilisticInitialFormula(AnnotatedInitialFormula... children) throws Exception {
		if(children.length < 2) {
			throw new Exception("probabilistic init formulas need at least two children");
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
	
	public void validate() throws Exception {
		double sum = 0;
		for(AnnotatedInitialFormula probEffect : this.getChildren()) {
			sum += probEffect.getProbability().getNumber().doubleValue();
		}
		if(sum > 1) {
			throw new Exception("sum of probabilities is greater than 1");
		}
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(!requireDef.isEnabledProbabilisticEffects()) {
			throw new Exception("probabilistic init formulas are defined but :probabilistic-effects is not required");
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

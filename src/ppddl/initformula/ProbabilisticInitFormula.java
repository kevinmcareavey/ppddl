package ppddl.initformula;

import java.util.ArrayList;
import java.util.List;

import ppddl.InitFormula;
import ppddl.annotated.AnnotatedInitFormula;

public class ProbabilisticInitFormula extends InitFormula {
	
	private List<AnnotatedInitFormula> children;
	
	public ProbabilisticInitFormula(List<AnnotatedInitFormula> children) throws Exception {
		if(children.size() < 2) {
			throw new Exception("probabilistic init formulas need at least two children");
		}
		this.setChildren(children);
		this.validate();
	}
	
	@SafeVarargs
	public ProbabilisticInitFormula(AnnotatedInitFormula... children) throws Exception {
		if(children.length < 2) {
			throw new Exception("probabilistic init formulas need at least two children");
		}
		List<AnnotatedInitFormula> list = new ArrayList<AnnotatedInitFormula>();
		for(int i = 0; i < children.length; i++) {
			list.add(children[i]);
		}
		this.setChildren(list);
		this.validate();
	}

	public List<AnnotatedInitFormula> getChildren() {
		return children;
	}

	public void setChildren(List<AnnotatedInitFormula> children) {
		this.children = children;
	}
	
	public void validate() throws Exception {
		double sum = 0;
		for(AnnotatedInitFormula probEffect : this.getChildren()) {
			sum += probEffect.getProbability().getNumber().doubleValue();
		}
		if(sum > 1) {
			throw new Exception("sum of probabilities is greater than 1");
		}
	}

	@Override
	public String toString() {
		String output = "(probabilistic";
		for(AnnotatedInitFormula annotatedInitial : this.getChildren()) {
			output += " " + annotatedInitial.toString();
		}
		output += ")";
		return output;
	}

}

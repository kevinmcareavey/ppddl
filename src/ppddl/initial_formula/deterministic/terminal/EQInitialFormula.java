package ppddl.initial_formula.deterministic.terminal;

import ppddl.Requirements;
import ppddl.arithmetic_expression.Function;
import ppddl.arithmetic_expression.MyNumber;
import ppddl.initial_formula.deterministic.TerminalDeterministicInitialFormula;

public class EQInitialFormula extends TerminalDeterministicInitialFormula {
	
	private Function leftChild;
	private MyNumber rightChild;
	
	public EQInitialFormula(Function leftChild, MyNumber rightChild) {
		this.setLeftChild(leftChild);
		this.setRightChild(rightChild);
	}

	public Function getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Function leftChild) {
		this.leftChild = leftChild;
	}
	
	public MyNumber getRightChild() {
		return rightChild;
	}

	public void setRightChild(MyNumber rightChild) {
		this.rightChild = rightChild;
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(!requireDef.isEnabledFluents()) {
			throw new Exception("equality init formulas are defined but :fluents is not required");
		}
	}

	@Override
	public String toString() {
		return "(= " + this.getLeftChild() + " " + this.getRightChild() + ")";
	}

}

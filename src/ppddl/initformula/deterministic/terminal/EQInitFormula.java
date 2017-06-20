package ppddl.initformula.deterministic.terminal;

import ppddl.arithmeticexpression.Function;
import ppddl.arithmeticexpression.MyNumber;
import ppddl.initformula.deterministic.TerminalDeterministicInitFormula;

public class EQInitFormula extends TerminalDeterministicInitFormula {
	
	private Function leftChild;
	private MyNumber rightChild;
	
	public EQInitFormula(Function leftChild, MyNumber rightChild) {
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
	public String toString() {
		return "(= " + this.getLeftChild() + " " + this.getRightChild() + ")";
	}

}

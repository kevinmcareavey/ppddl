package ppddl.ainitel;

import java.util.ArrayList;
import java.util.List;

import ppddl.AInitEl;
import ppddl.initel.PInitEl;

public class InitialProbabilisticConjunction extends AInitEl {
	
	private List<PInitEl> children;
	
	public InitialProbabilisticConjunction(List<PInitEl> children) {
		this.setChildren(children);
	}
	
	public InitialProbabilisticConjunction(PInitEl... children) {
		List<PInitEl> list = new ArrayList<PInitEl>();
		for(int i = 0; i < children.length; i++) {
			list.add(children[i]);
		}
		this.setChildren(list);
	}

	public List<PInitEl> getChildren() {
		return children;
	}

	public void setChildren(List<PInitEl> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		String output = "(and";
		for(PInitEl pInitEl : this.getChildren()) {
			output += " " + pInitEl.toString();
		}
		output += ")";
		return output;
	}

}

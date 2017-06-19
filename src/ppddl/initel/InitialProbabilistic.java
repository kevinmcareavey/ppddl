package ppddl.initel;

import java.util.ArrayList;
import java.util.List;

import ppddl.InitEl;
import ppddl.ProbInitEl;

public class InitialProbabilistic extends InitEl {
	
	private List<ProbInitEl> children;
	
	public InitialProbabilistic(List<ProbInitEl> children) {
		this.setChildren(children);
	}
	
	public InitialProbabilistic(ProbInitEl... children) {
		List<ProbInitEl> list = new ArrayList<ProbInitEl>();
		for(int i = 0; i < children.length; i++) {
			list.add(children[i]);
		}
		this.setChildren(list);
	}

	public List<ProbInitEl> getChildren() {
		return children;
	}

	public void setChildren(List<ProbInitEl> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		String output = "(probabilistic";
		for(ProbInitEl probInitEl : this.getChildren()) {
			output += " " + probInitEl.toString();
		}
		output += ")";
		return output;
	}

}

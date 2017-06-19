package ppddl.ainitel;

import ppddl.AInitEl;
import ppddl.initel.PInitEl;

public class InitialProbabilisticPInitEl extends AInitEl {
	
	private PInitEl child;
	
	public InitialProbabilisticPInitEl(PInitEl child) {
		this.setChild(child);
	}

	public PInitEl getChild() {
		return child;
	}

	public void setChild(PInitEl child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return this.getChild().toString();
	}

}

package ppddl.initel.ainitel.nary;

import java.util.List;

import ppddl.initel.ainitel.NaryAInitEl;
import ppddl.initel.ainitel.PInitEl;

/*
 * Warning: a ConjunctiveInitial should not be used to instantiate and InitEl object.
 */
public class ConjunctiveInitial extends NaryAInitEl<PInitEl> {
	
	public ConjunctiveInitial(List<PInitEl> children) {
		super(children);
	}
	
	public ConjunctiveInitial(PInitEl... children) {
		super(children);
	}
	
	@Override
	public String getSymbol() {
		return "and";
	}

}

package ppddl.initel.nary;

import java.util.List;

import ppddl.annotated.AnnotatedInitial;
import ppddl.initel.NaryInitEl;

public class ProbabilisticInitial extends NaryInitEl<AnnotatedInitial> {
	
	public ProbabilisticInitial(List<AnnotatedInitial> children) {
		super(children);
	}
	
	public ProbabilisticInitial(AnnotatedInitial... children) {
		super(children);
	}
	
	@Override
	public String getSymbol() {
		return "probabilistic";
	}

}

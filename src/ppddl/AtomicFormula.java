package ppddl;

import java.util.List;

import ppddl.action.GD;
import ppddl.domain.Predicate;

public class AtomicFormula<T> extends GD {
	
	private Predicate predicate;
	private List<T> arguments;
	
	@Override
	public String toString() {
		if(arguments.isEmpty()) {
			return predicate.toString();
		} else {
			String output = "(" + predicate.toString();
			for(T t : arguments) {
				output += " " + t.toString();
			}
			output += ")";
			return output;
		}
	}
	
}

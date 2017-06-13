package ppddl.action;

public class ActionDefBody {
	
	private GD gd;
	private Effect effect;
	
	@Override
	public String toString() {
		String output = ":precondition " + gd.toString() + "\n";
		output += ":effect " + effect.toString();
		return output;
	}
	
}

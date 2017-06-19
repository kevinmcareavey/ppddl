package ppddl;

import ppddl.myeffect.Effect;

public class ActionDefBody {
	
	private GD gd;
	private Effect effect;
	
	public ActionDefBody(GD gd, Effect effect) {
		this.setGD(gd);
		this.setEffect(effect);
	}
	
	public ActionDefBody(GD gd) {
		this.setGD(gd);
		this.setEffect(null);
	}
	
	public ActionDefBody(Effect effect) {
		this.setGD(null);
		this.setEffect(effect);
	}
	
	public ActionDefBody() {
		this.setGD(null);
		this.setEffect(null);
	}

	public GD getGD() {
		return gd;
	}

	public void setGD(GD gd) {
		this.gd = gd;
	}

	public Effect getEffect() {
		return effect;
	}

	public void setEffect(Effect effect) {
		this.effect = effect;
	}
	
	@Override
	public String toString() {
		String output = "";
		if(this.getGD() != null) {
			output += ":precondition " + this.getGD().toString();
		}
		if(this.getEffect() != null) {
			if(this.getGD() != null) {
				output += "\n";
			}
			output += ":effect " + this.getEffect().toString();
		}
		return output;
	}
	
}

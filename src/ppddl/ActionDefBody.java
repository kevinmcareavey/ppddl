package ppddl;

public class ActionDefBody {
	
	private Precondition gd;
	private Effect effect;
	
	public ActionDefBody(Precondition gd, Effect effect) {
		this.setGD(gd);
		this.setEffect(effect);
	}
	
	public ActionDefBody(Precondition gd) {
		this(gd, null);
	}
	
	public ActionDefBody(Effect effect) {
		this(null, effect);
	}
	
	public ActionDefBody() {
		this(null, null);
	}

	public Precondition getGD() {
		return gd;
	}

	public void setGD(Precondition gd) {
		this.gd = gd;
	}

	public Effect getEffect() {
		return effect;
	}

	public void setEffect(Effect effect) {
		this.effect = effect;
	}
	
	public boolean isEmpty() {
		return this.getGD() == null && this.getEffect() == null;
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

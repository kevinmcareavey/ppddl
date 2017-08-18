package ppddl.exception;

public class NameException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 917221951709642746L;

	public NameException() {
		super("names must start with an alphabetic character, followed by a (possibly empty) sequence of alphanumeric characters, hypens, and underscores");
	}

}

package external.planner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import external.Action;
import external.Planner;
import ppddl.name.ActionSymbol;
import ppddl.term.Constant;

public class FF extends Planner {
	
	public FF(String path) {
		super(path);
	}
	
	@Override
	public List<Action> run(String domain, String problem) throws Exception {
		String[] cmd = {this.getPath(), "-o", domain, "-f", problem};
		Process process = Runtime.getRuntime().exec(cmd);
		process.waitFor();
		int exitStatus = process.exitValue();
		if(exitStatus != 0) {
			throw new Exception("ff exited with status " + exitStatus);
		}
		
		String uri = problem + ".ff";
		FileReader reader = new FileReader(uri);
		BufferedReader bufferedReader = new BufferedReader(reader);
	    
	    String line;
	    boolean skip = true;
	    List<Action> plan = new ArrayList<Action>();
	    while((line = bufferedReader.readLine()) != null) {
	    	if(skip) {
	    		skip = false;
	    	} else {
	    		plan.add(this.parseAction(line));
	    	}
	    }
	    reader.close();
	    return plan;
	}
	
	private Action parseAction(String input) throws Exception {
		String[] tokens = input.replace("(", "").replace(")", "").split("\\s+");
		ActionSymbol actionSymbol = new ActionSymbol(tokens[0].toLowerCase());
		List<Constant> arguments = new ArrayList<Constant>();
		for(int i = 1; i < tokens.length; i++) {
			arguments.add(new Constant(tokens[i].toLowerCase()));
		}
		return new Action(actionSymbol, arguments);
	}

}

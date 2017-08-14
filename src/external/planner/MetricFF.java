package external.planner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import external.Action;
import external.Planner;
import ppddl.name.ActionSymbol;
import ppddl.term.Constant;

public class MetricFF extends Planner {

	public MetricFF(String path) {
		super(path);
	}

	@Override
	public List<Action> run(String domain, String problem) throws Exception {
		String[] cmd = {this.getPath(), "-o", domain, "-f", problem, "-s", "0"};
		Process process = Runtime.getRuntime().exec(cmd);
		process.waitFor();
		int exitStatus = process.exitValue();
		if(exitStatus != 0) {
			throw new Exception("metric-ff exited with status " + exitStatus);
		}
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	    
	    String line;
	    boolean skip = true;
	    List<Action> plan = new ArrayList<Action>();
	    while((line = bufferedReader.readLine()) != null) {
	    	if(line.contains("time spent:")) {
	    		skip = true;
	    	}
	    	if(!skip) {
	    		if(!line.trim().isEmpty()) {
		    		plan.add(this.parseAction(line));
	    		}
	    	}
	    	if(line.contains("found legal plan as follows")) {
	    		skip = false;
	    	}
	    }
	    return plan;
	}
	
	private Action parseAction(String input) throws Exception {
		String[] tokens = input.split(":");
		tokens = tokens[1].substring(1, tokens[1].length()).split("\\s+");
		ActionSymbol actionSymbol = new ActionSymbol(tokens[0].toLowerCase());
		List<Constant> arguments = new ArrayList<Constant>();
		for(int i = 1; i < tokens.length; i++) {
			arguments.add(new Constant(tokens[i].toLowerCase()));
		}
		return new Action(actionSymbol, arguments);
	}

}

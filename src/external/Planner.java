package external;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import ppddl.Domain;
import ppddl.Problem;

public abstract class Planner {
	
	private String path;
	
	public Planner(String path) {
		this.setPath(path);
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public List<Action> run(Domain domain, Problem problem) throws Exception {
		BufferedWriter domainWriter = new BufferedWriter(new FileWriter("domain.pddl"));
		domainWriter.write(domain.toString());
		domainWriter.close();
	    
		BufferedWriter problemWriter = new BufferedWriter(new FileWriter("problem.pddl"));
	    problemWriter.write(problem.toString());
	    problemWriter.close();
	    
		return this.run("domain.pddl", "problem.pddl");
	}
	
	public abstract List<Action> run(String domain, String problem) throws Exception;

}

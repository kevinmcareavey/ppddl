package ppddl.domain;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TypedList<T> extends LinkedHashMap<List<T>, Type> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4132340636180180844L;
	
	public void add(T t) throws Exception {
		List<T> list = new ArrayList<T>();
		list.add(t);
		if(this.containsKey(list)) {
			throw new Exception("type already set for " + list);
		}
		this.put(list, new Type());
	}
	
	public void add(T t, Type type) throws Exception {
		if(type.isEmpty()) {
			throw new Exception("empty type");
		}
		List<T> list = new ArrayList<T>();
		list.add(t);
		if(this.containsKey(list)) {
			throw new Exception("type already set for " + list);
		}
		this.put(list, type);
	}
	
	public void add(List<T> list, Type type) throws Exception {
		if(list.isEmpty()) {
			throw new Exception("empty list of typed objects");
		}
		if(type.isEmpty()) {
			throw new Exception("empty type");
		}
		if(this.containsKey(list)) {
			throw new Exception("type already set for " + list);
		}
		this.put(list, type);
	}

	@Override
	public String toString() {
		String output = "";
		List<T> end = new ArrayList<T>();
		String delim = "";
		for(Map.Entry<List<T>, Type> entry : this.entrySet()) {
			List<T> list = entry.getKey();
			Type type = entry.getValue();
			if(type.isEmpty()) {
				end.addAll(list);
			} else {
				output += delim;
				delim = " ";
				for(T t : list) {
					output += t.toString() + " ";
				}
				output += "- " + type.toString();
			}
		}
		if(output.length() > 0 && !end.isEmpty()) {
			output += " ";
		}
		delim = "";
		for(T t : end) {
			output += delim + t.toString();
			delim = " ";
		}
		return output;
	}
	
}

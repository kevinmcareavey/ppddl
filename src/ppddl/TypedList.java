package ppddl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TypedList<T extends Typable> extends LinkedHashMap<T, Type> implements Requires {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4132340636180180844L;
	
	public void add(T t, Type type) throws Exception {
		if(this.containsKey(t)) {
			throw new Exception("type already set for " + t.toString());
		}
		this.put(t, type);
	}
	
	public void add(T t) throws Exception {
		this.add(t, null);
	}
	
	@Override
	public void validate(Requirements requireDef) throws Exception {
		if(!requireDef.isEnabledTyping()) {
			for(Map.Entry<T, Type> entry : this.entrySet()) {
				Type type = entry.getValue();
				if(type != null) {
					throw new Exception("types are defined but :typing is not required");
				}
			}
		}
	}

	@Override
	public String toString() {
		Map<Type, List<T>> typed = new LinkedHashMap<Type, List<T>>();
		List<T> untyped = new ArrayList<T>();
		for(Map.Entry<T, Type> entry : this.entrySet()) {
			T t = entry.getKey();
			Type type = entry.getValue();
			if(type == null) {
				untyped.add(t);
			} else {
				if(!typed.containsKey(type)) {
					List<T> list = new ArrayList<T>();
					list.add(t);
					typed.put(type, list);
				} else {
					List<T> list = typed.get(type);
					list.add(t);
					typed.put(type, list);
				}
			}
		}
		
		String output = "";
		String delim = "";
		for(Map.Entry<Type, List<T>> entry : typed.entrySet()) {
			Type type = entry.getKey();
			List<T> list = entry.getValue();
			output += delim;
			delim = " ";
			for(T t : list) {
				output += t.toString() + " ";
			}
			output += "- " + type.toString();
		}
		if(!typed.isEmpty() && !untyped.isEmpty()) {
			output += " ";
		}
		delim = "";
		for(T t : untyped) {
			output += delim + t.toString();
			delim = " ";
		}
		return output;
	}
	
}

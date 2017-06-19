package ppddl.type;

import java.util.ArrayList;
import java.util.List;

import ppddl.Type;

public class CompositeType extends Type {
	
	private List<PrimitiveType> primitiveTypes;

	public CompositeType(List<PrimitiveType> primitiveTypes) throws Exception {
		if(primitiveTypes.isEmpty()) {
			throw new Exception("composite type is empty");
		}
		this.setPrimitiveTypes(primitiveTypes);
	}
	
	public CompositeType(PrimitiveType... primitiveTypes) throws Exception {
		if(primitiveTypes.length == 0) {
			throw new Exception("composite type is empty");
		}
		this.setPrimitiveTypes(new ArrayList<PrimitiveType>());
		for(int i = 0; i < primitiveTypes.length; i++) {
			this.getPrimitiveTypes().add(primitiveTypes[i]);
		}
	}

	public List<PrimitiveType> getPrimitiveTypes() {
		return primitiveTypes;
	}

	public void setPrimitiveTypes(List<PrimitiveType> primitiveTypes) {
		this.primitiveTypes = primitiveTypes;
	}

	@Override
	public String toString() {
		String output = "";
		if(!this.getPrimitiveTypes().isEmpty()) {
			if(this.getPrimitiveTypes().size() == 1) {
				output += this.getPrimitiveTypes().get(0).toString();
			} else {
				output += "(either";
				for(PrimitiveType primitiveType: this.getPrimitiveTypes()) {
					output += " " + primitiveType.toString();
				}
				output += ")";
			}
		}
		return output;
	}

}

package ppddl.main.type;

import java.util.ArrayList;
import java.util.List;

import ppddl.exception.TypeException;
import ppddl.main.Type;

public class UnionType extends Type {
	
	private List<SimpleType> simpleTypes;

	public UnionType(List<SimpleType> simpleTypes) throws TypeException {
		if(simpleTypes.isEmpty()) {
			throw new TypeException("union type is empty");
		}
		this.setSimpleTypes(simpleTypes);
	}
	
	public UnionType(SimpleType... simpleTypes) throws TypeException {
		if(simpleTypes.length == 0) {
			throw new TypeException("union type is empty");
		}
		this.setSimpleTypes(new ArrayList<SimpleType>());
		for(int i = 0; i < simpleTypes.length; i++) {
			this.getSimpleTypes().add(simpleTypes[i]);
		}
	}

	public List<SimpleType> getSimpleTypes() {
		return simpleTypes;
	}

	public void setSimpleTypes(List<SimpleType> simpleTypes) {
		this.simpleTypes = simpleTypes;
	}

	@Override
	public String toString() {
		String output = "";
		if(!this.getSimpleTypes().isEmpty()) {
			if(this.getSimpleTypes().size() == 1) {
				output += this.getSimpleTypes().get(0).toString();
			} else {
				output += "(either";
				for(SimpleType simpleType: this.getSimpleTypes()) {
					output += " " + simpleType.toString();
				}
				output += ")";
			}
		}
		return output;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((simpleTypes == null) ? 0 : simpleTypes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnionType other = (UnionType) obj;
		if (simpleTypes == null) {
			if (other.simpleTypes != null)
				return false;
		} else if (!simpleTypes.equals(other.simpleTypes))
			return false;
		return true;
	}

}

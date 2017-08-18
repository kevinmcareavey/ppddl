package ppddl.main.typedlist;

import java.util.Map;

import ppddl.data_structure.AdvancedSet;
import ppddl.main.Type;
import ppddl.main.TypedList;
import ppddl.main.type.SimpleType;
import ppddl.main.type.UnionType;

public class Types extends TypedList<SimpleType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8442844967011689198L;
	
	public AdvancedSet<Type> getSubTypes(Type type) {
		AdvancedSet<Type> subTypes = new AdvancedSet<Type>();
		for(Map.Entry<SimpleType, Type> entry : this.entrySet()) {
			Type superType = entry.getValue();
			if(superType != null) {
				if(type.equals(superType)) {
					SimpleType subType = entry.getKey();
					subTypes.add(subType);
				}
			}
		}
		subTypes.add(type);
		return subTypes;
	}
	
	/*
	 * A union type can't have a supertype.
	 */
	public AdvancedSet<Type> getSuperTypes(SimpleType simpleType) {
		AdvancedSet<Type> superTypes = new AdvancedSet<Type>();
		for(Map.Entry<SimpleType, Type> entry : this.entrySet()) {
			SimpleType subType = entry.getKey();
			if(simpleType.equals(subType)) {
				Type superType = entry.getValue();
				if(superType != null) {
					superTypes.add(superType);
				}
			}
		}
		superTypes.add(simpleType);
		superTypes.add(SimpleType.OBJECT);
		return superTypes;
	}
	
	public AdvancedSet<SimpleType> getSimpleTypes() {
		AdvancedSet<SimpleType> simpleTypes = new AdvancedSet<SimpleType>();
		for(Map.Entry<SimpleType, Type> entry : this.entrySet()) {
			simpleTypes.add(entry.getKey());
			Type type = entry.getValue();
			if(type instanceof SimpleType) {
				simpleTypes.add((SimpleType) type);
			} else if(type instanceof UnionType) {
				simpleTypes.addAll(((UnionType) type).getSimpleTypes());
			}
		}
		return simpleTypes;
	}
	
	public boolean isSubtypeOf(Type subtype, Type supertype) {
		if(supertype.equals(SimpleType.OBJECT)) {
			return true;
		} else if(subtype instanceof SimpleType) {
			if(this.containsKey(subtype)) {
				Type storedSupertype = this.get(subtype);
				if(storedSupertype != null) {
					if(storedSupertype.equals(supertype)) {
						return true;
					} else {
						return this.isSubtypeOf(storedSupertype, supertype);
					}
				}
			}
		} else if(subtype instanceof UnionType) {
			for(SimpleType simpleSubtype : ((UnionType) subtype).getSimpleTypes()) {
				if(!this.isSubtypeOf(simpleSubtype, supertype)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public boolean isSupertypeOf(Type supertype, Type subtype) {
		return false;
	}

	@Override
	public String toString() {
		if(this.isEmpty()) {
			return "";
		} else {
			return "(:types " + super.toString() + ")";
		}
	}
	
}

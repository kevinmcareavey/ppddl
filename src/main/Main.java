package main;

import java.util.ArrayList;
import java.util.List;

import ppddl.Name;
import ppddl.action.Variable;
import ppddl.domain.AtomicFormulaSkeleton;
import ppddl.domain.ConstantsDef;
import ppddl.domain.FunctionSkeleton;
import ppddl.domain.FunctionSymbol;
import ppddl.domain.FunctionsDef;
import ppddl.domain.Predicate;
import ppddl.domain.PredicatesDef;
import ppddl.domain.PrimitiveType;
import ppddl.domain.RequireDef;
import ppddl.domain.Type;
import ppddl.domain.TypedList;
import ppddl.domain.TypesDef;

public class Main {
	
	public static void requireDef() {
		RequireDef requireDef = new RequireDef();
		requireDef.enableSTRIPS();
		requireDef.enableTyping();
		requireDef.enableEquality();
		requireDef.enableNegativePreconditions();
		requireDef.enableDisjunctivePreconditions();
		requireDef.enableExistentialPreconditions();
		requireDef.enableUniversalPreconditions();
		requireDef.enableQuantifiedPreconditions();
		requireDef.enableConditionalEffects();
		requireDef.enableProbabilisticEffects();
		requireDef.enableRewards();
		requireDef.enableFluents();
		requireDef.enableADL();
		requireDef.enableMDP();
		System.out.println(requireDef);
	}
	
	public static void typesDef() throws Exception {
		TypesDef typesDef = new TypesDef();
		
		typesDef.add(new Name("n1"));
		
		Type t1 = new Type();
		t1.add(new PrimitiveType("pt1"));
		typesDef.add(new Name("n2"), t1);
		
		Type t2 = new Type();
		t2.add(new PrimitiveType("pt2"));
		t2.add(new PrimitiveType("pt3"));
		typesDef.add(new Name("n3"), t2);
		
		List<Name> ln1 = new ArrayList<Name>();
		ln1.add(new Name("n4"));
		ln1.add(new Name("n5"));
		Type t3 = new Type();
		t3.add(new PrimitiveType("pt4"));
		typesDef.add(ln1, t3);
		
		List<Name> ln2 = new ArrayList<Name>();
		ln2.add(new Name("n6"));
		ln2.add(new Name("n7"));
		Type t4 = new Type();
		t4.add(new PrimitiveType("pt5"));
		t4.add(new PrimitiveType("pt6"));
		typesDef.add(ln2, t4);
		
		System.out.println(typesDef);
	}
	
	public static void constantsDef() throws Exception {
		ConstantsDef constantsDef = new ConstantsDef();
		
		constantsDef.add(new Name("n1"));
		
		Type t1 = new Type();
		t1.add(new PrimitiveType("pt1"));
		constantsDef.add(new Name("n2"), t1);
		
		Type t2 = new Type();
		t2.add(new PrimitiveType("pt2"));
		t2.add(new PrimitiveType("pt3"));
		constantsDef.add(new Name("n3"), t2);
		
		List<Name> ln1 = new ArrayList<Name>();
		ln1.add(new Name("n4"));
		ln1.add(new Name("n5"));
		Type t3 = new Type();
		t3.add(new PrimitiveType("pt4"));
		constantsDef.add(ln1, t3);
		
		List<Name> ln2 = new ArrayList<Name>();
		ln2.add(new Name("n6"));
		ln2.add(new Name("n7"));
		Type t4 = new Type();
		t4.add(new PrimitiveType("pt5"));
		t4.add(new PrimitiveType("pt6"));
		constantsDef.add(ln2, t4);
		
		System.out.println(constantsDef);
	}
	
	public static void predicatesDef() throws Exception {
		PredicatesDef predicatesDef = new PredicatesDef();
		
		// (1)
		Predicate p1 = new Predicate("p1");
		TypedList<Variable> tlv1 = new TypedList<Variable>();
		tlv1.add(new Variable("v1"));
		AtomicFormulaSkeleton afs1 = new AtomicFormulaSkeleton(p1, tlv1);
		predicatesDef.add(afs1);
		
		// (1,1)
		Predicate p2 = new Predicate("p2");
		TypedList<Variable> tlv2 = new TypedList<Variable>();
		Type t1 = new Type();
		t1.add(new PrimitiveType("pt1"));
		tlv2.add(new Variable("v2"), t1);
		AtomicFormulaSkeleton afs2 = new AtomicFormulaSkeleton(p2, tlv2);
		predicatesDef.add(afs2);
		
		// (1,N)
		Predicate p3 = new Predicate("p3");
		TypedList<Variable> tlv3 = new TypedList<Variable>();
		Type t2 = new Type();
		t2.add(new PrimitiveType("pt2"));
		t2.add(new PrimitiveType("pt3"));
		tlv3.add(new Variable("v3"), t2);
		AtomicFormulaSkeleton afs3 = new AtomicFormulaSkeleton(p3, tlv3);
		predicatesDef.add(afs3);
		
		// (N,1)
		Predicate p4 = new Predicate("p4");
		TypedList<Variable> tlv4 = new TypedList<Variable>();
		Type t3 = new Type();
		t3.add(new PrimitiveType("pt4"));
		List<Variable> lv1 = new ArrayList<Variable>();
		lv1.add(new Variable("v4"));
		lv1.add(new Variable("v5"));
		tlv4.add(lv1, t3);
		AtomicFormulaSkeleton afs4 = new AtomicFormulaSkeleton(p4, tlv4);
		predicatesDef.add(afs4);
		
		// (N,N)
		Predicate p5 = new Predicate("p5");
		TypedList<Variable> tlv5 = new TypedList<Variable>();
		Type t4 = new Type();
		t4.add(new PrimitiveType("pt5"));
		t4.add(new PrimitiveType("pt6"));
		List<Variable> lv2 = new ArrayList<Variable>();
		lv2.add(new Variable("v6"));
		lv2.add(new Variable("v7"));
		tlv5.add(lv2, t4);
		AtomicFormulaSkeleton afs5 = new AtomicFormulaSkeleton(p5, tlv5);
		predicatesDef.add(afs5);
		
		System.out.println(predicatesDef);
	}
	
	public static void functionsDef() throws Exception {
		FunctionsDef functionsDef = new FunctionsDef();
		
		FunctionSkeleton fs1 = new FunctionSkeleton(new FunctionSymbol("fs1"));
		functionsDef.add(fs1);
		
		TypedList<Variable> tlv1 = new TypedList<Variable>();
		tlv1.add(new Variable("v1"));
		FunctionSkeleton fs2 = new FunctionSkeleton(new FunctionSymbol("fs2"), tlv1);
		functionsDef.add(fs2);
		
		TypedList<Variable> tlv2 = new TypedList<Variable>();
		tlv2.add(new Variable("v2"));
		tlv2.add(new Variable("v3"));
		FunctionSkeleton fs3 = new FunctionSkeleton(new FunctionSymbol("fs3"), tlv2);
		functionsDef.add(fs3);
		
		TypedList<Variable> tlv3 = new TypedList<Variable>();
		Type t1 = new Type();
		t1.add(new PrimitiveType("pt1"));
		tlv3.add(new Variable("v3"), t1);
		FunctionSkeleton fs4 = new FunctionSkeleton(new FunctionSymbol("fs4"), tlv3);
		functionsDef.add(fs4);
		
		System.out.println(functionsDef);
	}
	
	public static void main(String[] args) {
		try {
//			requireDef();
//			typesDef();
//			constantsDef();
//			predicatesDef();
			functionsDef();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

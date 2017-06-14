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
		
		typesDef.add(new Name("t1"));
		
		Type t1 = new Type();
		t1.add(new PrimitiveType("pt1"));
		typesDef.add(new Name("t2"), t1);
		
		Type t2 = new Type();
		t2.add(new PrimitiveType("pt2"));
		t2.add(new PrimitiveType("pt3"));
		typesDef.add(new Name("n3"), t2);
		
		List<Name> ln1 = new ArrayList<Name>();
		ln1.add(new Name("t4"));
		ln1.add(new Name("t5"));
		Type t3 = new Type();
		t3.add(new PrimitiveType("pt4"));
		typesDef.add(ln1, t3);
		
		List<Name> ln2 = new ArrayList<Name>();
		ln2.add(new Name("t6"));
		ln2.add(new Name("t7"));
		Type t4 = new Type();
		t4.add(new PrimitiveType("pt5"));
		t4.add(new PrimitiveType("pt6"));
		typesDef.add(ln2, t4);
		
		System.out.println(typesDef);
	}
	
	public static void constantsDef() throws Exception {
		ConstantsDef constantsDef = new ConstantsDef();
		
		constantsDef.add(new Name("c1"));
		
		Type t1 = new Type();
		t1.add(new PrimitiveType("pt1"));
		constantsDef.add(new Name("c2"), t1);
		
		Type t2 = new Type();
		t2.add(new PrimitiveType("pt2"));
		t2.add(new PrimitiveType("pt3"));
		constantsDef.add(new Name("c3"), t2);
		
		List<Name> ln1 = new ArrayList<Name>();
		ln1.add(new Name("c4"));
		ln1.add(new Name("c5"));
		Type t3 = new Type();
		t3.add(new PrimitiveType("pt4"));
		constantsDef.add(ln1, t3);
		
		List<Name> ln2 = new ArrayList<Name>();
		ln2.add(new Name("c6"));
		ln2.add(new Name("c7"));
		Type t4 = new Type();
		t4.add(new PrimitiveType("pt5"));
		t4.add(new PrimitiveType("pt6"));
		constantsDef.add(ln2, t4);
		
		System.out.println(constantsDef);
	}
	
	public static void predicatesDef() throws Exception {
		PredicatesDef predicatesDef = new PredicatesDef();
		
		Predicate p1 = new Predicate("p1");
		predicatesDef.add(new AtomicFormulaSkeleton(p1));
		
		Predicate p2 = new Predicate("p2");
		TypedList<Variable> tlv1 = new TypedList<Variable>();
		tlv1.add(new Variable("v1"));
		predicatesDef.add(new AtomicFormulaSkeleton(p2, tlv1));
		
		Predicate p3 = new Predicate("p3");
		TypedList<Variable> tlv2 = new TypedList<Variable>();
		tlv2.add(new Variable("v2"));
		tlv2.add(new Variable("v3"));
		predicatesDef.add(new AtomicFormulaSkeleton(p3, tlv2));
		
		Predicate p4 = new Predicate("p4");
		TypedList<Variable> tlv3 = new TypedList<Variable>();
		Type t1 = new Type();
		t1.add(new PrimitiveType("pt1"));
		tlv3.add(new Variable("v4"), t1);
		predicatesDef.add(new AtomicFormulaSkeleton(p4, tlv3));
		
		Predicate p5 = new Predicate("p5");
		TypedList<Variable> tlv4 = new TypedList<Variable>();
		Type t2 = new Type();
		t2.add(new PrimitiveType("pt2"));
		t2.add(new PrimitiveType("pt3"));
		tlv4.add(new Variable("v5"), t2);
		predicatesDef.add(new AtomicFormulaSkeleton(p5, tlv4));
		
		Predicate p6 = new Predicate("p6");
		TypedList<Variable> tlv5 = new TypedList<Variable>();
		Type t3 = new Type();
		t3.add(new PrimitiveType("pt4"));
		List<Variable> lv1 = new ArrayList<Variable>();
		lv1.add(new Variable("v6"));
		lv1.add(new Variable("v7"));
		tlv5.add(lv1, t3);
		predicatesDef.add(new AtomicFormulaSkeleton(p6, tlv5));
		
		Predicate p7 = new Predicate("p7");
		TypedList<Variable> tlv6 = new TypedList<Variable>();
		Type t4 = new Type();
		t4.add(new PrimitiveType("pt5"));
		t4.add(new PrimitiveType("pt6"));
		List<Variable> lv2 = new ArrayList<Variable>();
		lv2.add(new Variable("v8"));
		lv2.add(new Variable("v9"));
		tlv6.add(lv2, t4);
		predicatesDef.add(new AtomicFormulaSkeleton(p7, tlv6));
		
		System.out.println(predicatesDef);
	}
	
	public static void functionsDef() throws Exception {
		FunctionsDef functionsDef = new FunctionsDef();
		
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs1")));
		
		TypedList<Variable> tlv1 = new TypedList<Variable>();
		tlv1.add(new Variable("v1"));
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs2"), tlv1));
		
		TypedList<Variable> tlv2 = new TypedList<Variable>();
		tlv2.add(new Variable("v2"));
		tlv2.add(new Variable("v3"));
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs3"), tlv2));
		
		TypedList<Variable> tlv3 = new TypedList<Variable>();
		Type t1 = new Type();
		t1.add(new PrimitiveType("pt1"));
		tlv3.add(new Variable("v4"), t1);
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs4"), tlv3));
		
		TypedList<Variable> tlv4 = new TypedList<Variable>();
		Type t2 = new Type();
		t2.add(new PrimitiveType("pt2"));
		t2.add(new PrimitiveType("pt3"));
		tlv4.add(new Variable("v5"), t2);
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs5"), tlv4));
		
		TypedList<Variable> tlv5 = new TypedList<Variable>();
		Type t3 = new Type();
		t3.add(new PrimitiveType("pt4"));
		List<Variable> lv1 = new ArrayList<Variable>();
		lv1.add(new Variable("v6"));
		lv1.add(new Variable("v7"));
		tlv5.add(lv1, t3);
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs6"), tlv5));
		
		TypedList<Variable> tlv6 = new TypedList<Variable>();
		Type t4 = new Type();
		t4.add(new PrimitiveType("pt5"));
		t4.add(new PrimitiveType("pt6"));
		List<Variable> lv2 = new ArrayList<Variable>();
		lv2.add(new Variable("v8"));
		lv2.add(new Variable("v9"));
		tlv6.add(lv2, t4);
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs7"), tlv6));
		
		System.out.println(functionsDef);
	}
	
	public static void main(String[] args) {
		try {
			requireDef();
			typesDef();
			constantsDef();
			predicatesDef();
			functionsDef();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

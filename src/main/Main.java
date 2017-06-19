package main;

import java.util.ArrayList;
import java.util.List;

import ppddl.ActionDefBody;
import ppddl.ActionSymbol;
import ppddl.AtomicFormula;
import ppddl.AtomicFormulaSkeleton;
import ppddl.Domain;
import ppddl.FunctionSkeleton;
import ppddl.FunctionSymbol;
import ppddl.GD;
import ppddl.Goal;
import ppddl.Init;
import ppddl.Name;
import ppddl.Predicate;
import ppddl.PredicatesDef;
import ppddl.ProbInitEl;
import ppddl.Problem;
import ppddl.RequireDef;
import ppddl.StructureDef;
import ppddl.Term;
import ppddl.TypedList;
import ppddl.ainitel.InitialProbabilisticConjunction;
import ppddl.ainitel.InitialProbabilisticPInitEl;
import ppddl.fexp.Function;
import ppddl.fexp.MyNumber;
import ppddl.fexp.Negative;
import ppddl.fexp.binaryop.Addition;
import ppddl.fexp.binaryop.Division;
import ppddl.fexp.binaryop.Multiplication;
import ppddl.fexp.binaryop.Subtraction;
import ppddl.fexp.function.FHead;
import ppddl.fexp.mynumber.Probability;
import ppddl.functiontypedlist.FunctionsDef;
import ppddl.gd.fcomp.EQ;
import ppddl.gd.fcomp.GE;
import ppddl.gd.fcomp.GT;
import ppddl.gd.fcomp.LE;
import ppddl.gd.fcomp.LT;
import ppddl.gd.formula.binary.Equality;
import ppddl.gd.formula.binary.Implication;
import ppddl.gd.formula.binary.quantified.Existential;
import ppddl.gd.formula.binary.quantified.Universal;
import ppddl.gd.formula.nary.Conjunction;
import ppddl.gd.formula.nary.Disjunction;
import ppddl.gd.formula.unary.Atom;
import ppddl.gd.formula.unary.Negation;
import ppddl.goal.gdgoal.GDMetricGoal;
import ppddl.goalspec.GoalRewardSpec;
import ppddl.initel.InitialProbabilistic;
import ppddl.initel.pinitel.InitialAtom;
import ppddl.initel.pinitel.InitialFunction;
import ppddl.metricspec.Maximize;
import ppddl.myeffect.Effect;
import ppddl.myeffect.ProbEffect;
import ppddl.myeffect.effect.formula.binary.Conditional;
import ppddl.myeffect.effect.formula.binary.UniversalEffect;
import ppddl.myeffect.effect.formula.nary.ConjunctiveEffect;
import ppddl.myeffect.effect.formula.nary.Probabilistic;
import ppddl.myeffect.effect.peffect.assignop.Assign;
import ppddl.myeffect.effect.peffect.assignop.ScaleDown;
import ppddl.myeffect.effect.peffect.assignop.ScaleUp;
import ppddl.myeffect.effect.peffect.assignop.additiveop.Decrease;
import ppddl.myeffect.effect.peffect.assignop.additiveop.Increase;
import ppddl.myeffect.effect.peffect.formula.unary.NegativeAtomicEffect;
import ppddl.myeffect.effect.peffect.formula.unary.PositiveAtomicEffect;
import ppddl.structuredef.ActionDef;
import ppddl.term.Constant;
import ppddl.term.Variable;
import ppddl.type.CompositeType;
import ppddl.type.PrimitiveType;
import ppddl.typedlist.ConstantsDef;
import ppddl.typedlist.ObjectsDef;
import ppddl.typedlist.TypesDef;

public class Main {
	
	public static RequireDef requireDef() {
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
		
		return requireDef;
	}
	
	public static TypesDef typesDef() throws Exception {
		TypesDef typesDef = new TypesDef();
		
		typesDef.add(new PrimitiveType("ct1"));
		
		CompositeType c1 = new CompositeType(new PrimitiveType("pt1"));
		typesDef.add(new PrimitiveType("ct2"), c1);
		
		CompositeType c2 = new CompositeType(new PrimitiveType("pt2"), new PrimitiveType("pt3"));
		typesDef.add(new PrimitiveType("ct3"), c2);
		
		CompositeType c3 = new CompositeType(new PrimitiveType("pt4"));
		typesDef.add(new PrimitiveType("ct4"), c3);
		typesDef.add(new PrimitiveType("ct5"), c3);
		
		CompositeType c4 = new CompositeType(new PrimitiveType("pt5"), new PrimitiveType("pt6"));
		typesDef.add(new PrimitiveType("ct6"), c4);
		typesDef.add(new PrimitiveType("ct7"), c4);
		
		return typesDef;
	}
	
	public static ConstantsDef constantsDef() throws Exception {
		ConstantsDef constantsDef = new ConstantsDef();
		
		constantsDef.add(new Constant("c1"));
		
		CompositeType c1 = new CompositeType(new PrimitiveType("pt1"));
		constantsDef.add(new Constant("c2"), c1);
		
		CompositeType c2 = new CompositeType(new PrimitiveType("pt2"), new PrimitiveType("pt3"));
		constantsDef.add(new Constant("c3"), c2);
		
		CompositeType c3 = new CompositeType(new PrimitiveType("pt4"));
		constantsDef.add(new Constant("c4"), c3);
		constantsDef.add(new Constant("c5"), c3);
		
		CompositeType c4 = new CompositeType(new PrimitiveType("pt5"), new PrimitiveType("pt6"));
		constantsDef.add(new Constant("c6"), c4);
		constantsDef.add(new Constant("c7"), c4);
		
		return constantsDef;
	}
	
	public static PredicatesDef predicatesDef() throws Exception {
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
		tlv3.add(new Variable("v4"), new CompositeType(new PrimitiveType("pt1")));
		predicatesDef.add(new AtomicFormulaSkeleton(p4, tlv3));
		
		Predicate p5 = new Predicate("p5");
		TypedList<Variable> tlv4 = new TypedList<Variable>();
		tlv4.add(new Variable("v5"), new CompositeType(new PrimitiveType("pt2"), new PrimitiveType("pt3")));
		predicatesDef.add(new AtomicFormulaSkeleton(p5, tlv4));
		
		Predicate p6 = new Predicate("p6");
		TypedList<Variable> tlv5 = new TypedList<Variable>();
		CompositeType c1 = new CompositeType(new PrimitiveType("pt4"));
		tlv5.add(new Variable("v6"), c1);
		tlv5.add(new Variable("v7"), c1);
		predicatesDef.add(new AtomicFormulaSkeleton(p6, tlv5));
		
		Predicate p7 = new Predicate("p7");
		TypedList<Variable> tlv6 = new TypedList<Variable>();
		CompositeType c2 = new CompositeType(new PrimitiveType("pt5"), new PrimitiveType("pt6"));
		tlv6.add(new Variable("v8"), c2);
		tlv6.add(new Variable("v9"), c2);
		predicatesDef.add(new AtomicFormulaSkeleton(p7, tlv6));
		
		return predicatesDef;
	}
	
	public static FunctionsDef functionsDef() throws Exception {
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
		tlv3.add(new Variable("v4"), new CompositeType(new PrimitiveType("pt1")));
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs4"), tlv3));
		
		TypedList<Variable> tlv4 = new TypedList<Variable>();
		tlv4.add(new Variable("v5"), new CompositeType(new PrimitiveType("pt2"), new PrimitiveType("pt3")));
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs5"), tlv4));
		
		TypedList<Variable> tlv5 = new TypedList<Variable>();
		CompositeType c1 = new CompositeType(new PrimitiveType("pt4"));
		tlv5.add(new Variable("v6"), c1);
		tlv5.add(new Variable("v7"), c1);
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs6"), tlv5));
		
		TypedList<Variable> tlv6 = new TypedList<Variable>();
		CompositeType c2 = new CompositeType(new PrimitiveType("pt5"), new PrimitiveType("pt6"));
		tlv6.add(new Variable("v8"), c2);
		tlv6.add(new Variable("v9"), c2);
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs7"), tlv6));
		
		return functionsDef;
	}
	
	public static List<GD> gds() throws Exception {
		List<GD> gds = new ArrayList<GD>();
		
		gds.add(new Atom(new Predicate("p1")));
		gds.add(new Atom(new Predicate("p1"), new Constant("c1")));
		gds.add(new Atom(new Predicate("p1"), new Variable("v1")));
		gds.add(new Atom(new Predicate("p1"), new Constant("c1"), new Variable("v1")));
		gds.add(new Negation(new Atom(new Predicate("p1"))));
		gds.add(new Negation(new Atom(new Predicate("p1"), new Constant("c1"), new Variable("v1"))));
		gds.add(new Equality(new Constant("c1"), new Constant("c2")));
		gds.add(new Equality(new Variable("v1"), new Variable("v2")));
		gds.add(new Equality(new Constant("c1"), new Variable("v1")));
		gds.add(new Equality(new Variable("v1"), new Constant("c1")));
		gds.add(new Negation(new Equality(new Constant("c1"), new Constant("c2"))));
		gds.add(new Negation(new Equality(new Variable("v1"), new Variable("v2"))));
		gds.add(new Negation(new Equality(new Constant("c1"), new Variable("v1"))));
		gds.add(new Negation(new Equality(new Variable("v1"), new Constant("c1"))));
		gds.add(new Conjunction(new Atom(new Predicate("p1")), new Atom(new Predicate("p2"))));
		gds.add(new Disjunction(new Atom(new Predicate("p1")), new Atom(new Predicate("p2"))));
		gds.add(new Implication(new Atom(new Predicate("p1")), new Atom(new Predicate("p2"))));
		
		TypedList<Variable> tl1 = new TypedList<Variable>();
		tl1.add(new Variable("v1"));
		
		gds.add(new Existential(tl1, new Atom(new Predicate("p1"))));
		gds.add(new Universal(tl1, new Atom(new Predicate("p1"))));
		
		gds.add(new EQ(new MyNumber(1), new MyNumber(2)));
		gds.add(new EQ(new MyNumber(1), new Function(new FunctionSymbol("f1"))));
		gds.add(new EQ(new MyNumber(1), new FHead(new FunctionSymbol("f1"), new Constant("c1"))));
		gds.add(new EQ(new MyNumber(1), new FHead(new FunctionSymbol("f1"), new Variable("v1"))));
		gds.add(new EQ(new MyNumber(1), new FHead(new FunctionSymbol("f1"), new Constant("c1"), new Variable("v1"))));
		gds.add(new LE(new MyNumber(1), new MyNumber(2)));
		gds.add(new LT(new MyNumber(1), new MyNumber(2)));
		gds.add(new GT(new MyNumber(1), new MyNumber(2)));
		gds.add(new GE(new MyNumber(1), new MyNumber(2)));
		gds.add(new EQ(new MyNumber(1), new Addition(new MyNumber(2), new MyNumber(3))));
		gds.add(new EQ(new MyNumber(1), new Division(new MyNumber(2), new MyNumber(3))));
		gds.add(new EQ(new MyNumber(1), new Multiplication(new MyNumber(2), new MyNumber(3))));
		gds.add(new EQ(new MyNumber(1), new Subtraction(new MyNumber(2), new MyNumber(3))));
		gds.add(new EQ(new MyNumber(1), new Negative(new MyNumber(1))));
		
		return gds;
	}
	
	public static List<Effect> effects() throws Exception {
		List<Effect> effects = new ArrayList<Effect>();
		
		effects.add(new PositiveAtomicEffect(new Predicate("p1")));
		effects.add(new NegativeAtomicEffect(new Predicate("p1")));
		effects.add(new Assign(new Function(new FunctionSymbol("f1")), new MyNumber(1)));
		effects.add(new ScaleUp(new Function(new FunctionSymbol("f1")), new MyNumber(1)));
		effects.add(new ScaleDown(new Function(new FunctionSymbol("f1")), new MyNumber(1)));
		effects.add(new Increase(new MyNumber(1)));
		effects.add(new Decrease(new MyNumber(1)));
		effects.add(new ConjunctiveEffect(new PositiveAtomicEffect(new Predicate("p1")), new PositiveAtomicEffect(new Predicate("p2"))));
		
		TypedList<Variable> tl1 = new TypedList<Variable>();
		tl1.add(new Variable("v1"));
		
		effects.add(new UniversalEffect(tl1, new PositiveAtomicEffect(new Predicate("p1"))));
		effects.add(new Conditional(new Atom(new Predicate("p1")), new PositiveAtomicEffect(new Predicate("p2"))));
		
		ProbEffect pe1 = new ProbEffect(new Probability(0.8), new PositiveAtomicEffect(new Predicate("p1")));
		ProbEffect pe2 = new ProbEffect(new Probability(0.2), new PositiveAtomicEffect(new Predicate("p1")));
		
		effects.add(new Probabilistic(pe1, pe2));
		
		return effects;
	}
	
	public static List<StructureDef> structureDefs() throws Exception {
		List<StructureDef> structureDefs = new ArrayList<StructureDef>();
		
		structureDefs.add(new ActionDef(new ActionSymbol("as1")));
		structureDefs.add(new ActionDef(new ActionSymbol("as2"), new ActionDefBody(new Atom(new Predicate("p1")), new PositiveAtomicEffect(new Predicate("p2")))));
		
		ProbEffect pe1 = new ProbEffect(new Probability(0.8), new PositiveAtomicEffect(new Predicate("p1")));
		ProbEffect pe2 = new ProbEffect(new Probability(0.2), new PositiveAtomicEffect(new Predicate("p1")));
		
		structureDefs.add(new ActionDef(new ActionSymbol("as1"), new ActionDefBody(new EQ(new MyNumber(1), new FHead(new FunctionSymbol("f1"), new Constant("c1"), new Variable("v1"))), new Probabilistic(pe1, pe2))));
		
		return structureDefs;
	}
	
	public static Domain domain() throws Exception {
		Domain domain = new Domain(new Name("d1"), requireDef(), typesDef(), constantsDef(), predicatesDef(), functionsDef(), structureDefs());
		return domain;
	}
	
	public static ObjectsDef objectsDef() throws Exception {
		ObjectsDef objectsDef = new ObjectsDef();
		
		objectsDef.add(new Constant("c1"));
		
		CompositeType c1 = new CompositeType(new PrimitiveType("pt1"));
		objectsDef.add(new Constant("c2"), c1);
		
		CompositeType c2 = new CompositeType(new PrimitiveType("pt2"), new PrimitiveType("pt3"));
		objectsDef.add(new Constant("c3"), c2);
		
		CompositeType c3 = new CompositeType(new PrimitiveType("pt4"));
		objectsDef.add(new Constant("c4"), c3);
		objectsDef.add(new Constant("c5"), c3);
		
		CompositeType c4 = new CompositeType(new PrimitiveType("pt5"), new PrimitiveType("pt6"));
		objectsDef.add(new Constant("c6"), c4);
		objectsDef.add(new Constant("c7"), c4);
		
		return objectsDef;
	}
	
	public static Init init() throws Exception {
		Init init = new Init();
		
		init.add(new InitialAtom(new AtomicFormula<Term>(new Predicate("p1"))));
		init.add(new InitialAtom(new AtomicFormula<Term>(new Predicate("p2"), new Constant("c1"))));
		init.add(new InitialAtom(new AtomicFormula<Term>(new Predicate("p3"), new Variable("v1"))));
		init.add(new InitialFunction(new Function(new FunctionSymbol("f1")), new MyNumber(1)));
		init.add(new InitialFunction(new FHead(new FunctionSymbol("f1"), new Constant("c2")), new MyNumber(2)));
		
		InitialProbabilisticPInitEl ip1 = new InitialProbabilisticPInitEl(new InitialAtom(new AtomicFormula<Term>(new Predicate("p4"))));
		InitialProbabilisticPInitEl ip2 = new InitialProbabilisticPInitEl(new InitialAtom(new AtomicFormula<Term>(new Predicate("p5"))));
		init.add(new InitialProbabilistic(new ProbInitEl(new Probability(0.8), ip1), new ProbInitEl(new Probability(0.2), ip2)));
		
		InitialProbabilisticConjunction ipc1 = new InitialProbabilisticConjunction(new InitialAtom(new AtomicFormula<Term>(new Predicate("p6"))), new InitialAtom(new AtomicFormula<Term>(new Predicate("p7"))));
		init.add(new InitialProbabilistic(new ProbInitEl(new Probability(0.8), ip1), new ProbInitEl(new Probability(0.2), ipc1)));
		
		return init;
	}
	
	public static Goal goal() throws Exception {
		GD gd1 = new EQ(new MyNumber(1), new FHead(new FunctionSymbol("f1"), new Constant("c1"), new Variable("v1")));
		Goal goal = new GDMetricGoal(new GoalRewardSpec(gd1, new MyNumber(1)), new Maximize(FHead.REWARD));
		return goal;
	}
	
	public static Problem problem() throws Exception {
		Problem problem = new Problem(new Name("p1"), new Name("d1"), requireDef(), objectsDef(), init(), goal());
		return problem;
	}
	
	public static void main(String[] args) {
		try {
//			System.out.println(requireDef());
//			System.out.println(typesDef());
//			System.out.println(constantsDef());
//			System.out.println(predicatesDef());
//			System.out.println(functionsDef());
//			System.out.println(gds());
//			System.out.println(effects());
//			System.out.println(structureDefs());
			System.out.println(domain());
//			System.out.println(objectsDef());
//			System.out.println(init());
//			System.out.println(goal());
			System.out.println(problem());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

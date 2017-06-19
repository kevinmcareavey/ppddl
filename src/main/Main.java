package main;

import java.util.ArrayList;
import java.util.List;

import ppddl.ActionDef;
import ppddl.ActionDefBody;
import ppddl.ActionSymbol;
import ppddl.AtomicFormula;
import ppddl.AtomicFormulaSkeleton;
import ppddl.Domain;
import ppddl.FunctionSkeleton;
import ppddl.FunctionSymbol;
import ppddl.Precondition;
import ppddl.Goal;
import ppddl.Init;
import ppddl.Effect;
import ppddl.Name;
import ppddl.Predicate;
import ppddl.PredicatesDef;
import ppddl.Problem;
import ppddl.RequireDef;
import ppddl.TypedList;
import ppddl.annotated.AnnotatedEffect;
import ppddl.annotated.AnnotatedInitial;
import ppddl.arithmeticexpression.Function;
import ppddl.arithmeticexpression.MyNumber;
import ppddl.arithmeticexpression.Negative;
import ppddl.arithmeticexpression.binaryop.Addition;
import ppddl.arithmeticexpression.binaryop.Division;
import ppddl.arithmeticexpression.binaryop.Multiplication;
import ppddl.arithmeticexpression.binaryop.Subtraction;
import ppddl.arithmeticexpression.function.FHead;
import ppddl.arithmeticexpression.mynumber.Probability;
import ppddl.effect.binary.Conditional;
import ppddl.effect.binary.UniversalEffect;
import ppddl.effect.binary.assignop.Assign;
import ppddl.effect.binary.assignop.ScaleDown;
import ppddl.effect.binary.assignop.ScaleUp;
import ppddl.effect.binary.assignop.additiveop.Decrease;
import ppddl.effect.binary.assignop.additiveop.Increase;
import ppddl.effect.nary.ConjunctiveEffect;
import ppddl.effect.nary.Probabilistic;
import ppddl.effect.unary.NegativeAtomicEffect;
import ppddl.effect.unary.PositiveAtomicEffect;
import ppddl.functiontypedlist.FunctionsDef;
import ppddl.goal.preconditiongoal.PreconditionMetricGoal;
import ppddl.goalspec.GoalRewardSpec;
import ppddl.initel.AInitEl;
import ppddl.initel.ainitel.nary.ConjunctiveInitial;
import ppddl.initel.ainitel.pinitel.binary.EQInitial;
import ppddl.initel.ainitel.pinitel.unary.AtomicInitial;
import ppddl.initel.nary.ProbabilisticInitial;
import ppddl.metricspec.Maximize;
import ppddl.precondition.binary.Equality;
import ppddl.precondition.binary.Implication;
import ppddl.precondition.binary.numericexpression.EQ;
import ppddl.precondition.binary.numericexpression.GE;
import ppddl.precondition.binary.numericexpression.GT;
import ppddl.precondition.binary.numericexpression.LE;
import ppddl.precondition.binary.numericexpression.LT;
import ppddl.precondition.binary.quantified.Existential;
import ppddl.precondition.binary.quantified.Universal;
import ppddl.precondition.nary.Conjunction;
import ppddl.precondition.nary.Disjunction;
import ppddl.precondition.unary.AtomicPrecondition;
import ppddl.precondition.unary.Negation;
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
	
	public static List<Precondition> gds() throws Exception {
		List<Precondition> gds = new ArrayList<Precondition>();
		
		gds.add(new AtomicPrecondition(new Predicate("p1")));
		gds.add(new AtomicPrecondition(new Predicate("p1"), new Constant("c1")));
		gds.add(new AtomicPrecondition(new Predicate("p1"), new Variable("v1")));
		gds.add(new AtomicPrecondition(new Predicate("p1"), new Constant("c1"), new Variable("v1")));
		gds.add(new Negation(new AtomicPrecondition(new Predicate("p1"))));
		gds.add(new Negation(new AtomicPrecondition(new Predicate("p1"), new Constant("c1"), new Variable("v1"))));
		gds.add(new Equality(new Constant("c1"), new Constant("c2")));
		gds.add(new Equality(new Variable("v1"), new Variable("v2")));
		gds.add(new Equality(new Constant("c1"), new Variable("v1")));
		gds.add(new Equality(new Variable("v1"), new Constant("c1")));
		gds.add(new Negation(new Equality(new Constant("c1"), new Constant("c2"))));
		gds.add(new Negation(new Equality(new Variable("v1"), new Variable("v2"))));
		gds.add(new Negation(new Equality(new Constant("c1"), new Variable("v1"))));
		gds.add(new Negation(new Equality(new Variable("v1"), new Constant("c1"))));
		gds.add(new Conjunction(new AtomicPrecondition(new Predicate("p1")), new AtomicPrecondition(new Predicate("p2"))));
		gds.add(new Disjunction(new AtomicPrecondition(new Predicate("p1")), new AtomicPrecondition(new Predicate("p2"))));
		gds.add(new Implication(new AtomicPrecondition(new Predicate("p1")), new AtomicPrecondition(new Predicate("p2"))));
		
		TypedList<Variable> tl1 = new TypedList<Variable>();
		tl1.add(new Variable("v1"));
		
		gds.add(new Existential(tl1, new AtomicPrecondition(new Predicate("p1"))));
		gds.add(new Universal(tl1, new AtomicPrecondition(new Predicate("p1"))));
		
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
		effects.add(new Conditional(new AtomicPrecondition(new Predicate("p1")), new PositiveAtomicEffect(new Predicate("p2"))));
		
		AnnotatedEffect pe1 = new AnnotatedEffect(new Probability(0.8), new PositiveAtomicEffect(new Predicate("p1")));
		AnnotatedEffect pe2 = new AnnotatedEffect(new Probability(0.2), new PositiveAtomicEffect(new Predicate("p1")));
		
		effects.add(new Probabilistic(pe1, pe2));
		
		return effects;
	}
	
	public static List<ActionDef> structureDefs() throws Exception {
		List<ActionDef> structureDefs = new ArrayList<ActionDef>();
		
		structureDefs.add(new ActionDef(new ActionSymbol("as1")));
		structureDefs.add(new ActionDef(new ActionSymbol("as2"), new ActionDefBody(new AtomicPrecondition(new Predicate("p1")), new PositiveAtomicEffect(new Predicate("p2")))));
		
		AnnotatedEffect pe1 = new AnnotatedEffect(new Probability(0.8), new PositiveAtomicEffect(new Predicate("p1")));
		AnnotatedEffect pe2 = new AnnotatedEffect(new Probability(0.2), new PositiveAtomicEffect(new Predicate("p1")));
		
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
		
		init.add(new AtomicInitial(new AtomicFormula(new Predicate("p1"))));
		init.add(new AtomicInitial(new AtomicFormula(new Predicate("p2"), new Constant("c1"))));
		init.add(new AtomicInitial(new AtomicFormula(new Predicate("p3"), new Variable("v1"))));
		init.add(new EQInitial(new Function(new FunctionSymbol("f1")), new MyNumber(1)));
		init.add(new EQInitial(new FHead(new FunctionSymbol("f1"), new Constant("c2")), new MyNumber(2)));
		
		AInitEl ip1 = new AtomicInitial(new AtomicFormula(new Predicate("p4")));
		AInitEl ip2 = new AtomicInitial(new AtomicFormula(new Predicate("p5")));
		init.add(new ProbabilisticInitial(new AnnotatedInitial(new Probability(0.8), ip1), new AnnotatedInitial(new Probability(0.2), ip2)));
		
		AInitEl ipc1 = new ConjunctiveInitial(new AtomicInitial(new AtomicFormula(new Predicate("p6"))), new AtomicInitial(new AtomicFormula(new Predicate("p7"))));
		init.add(new ProbabilisticInitial(new AnnotatedInitial(new Probability(0.8), ip1), new AnnotatedInitial(new Probability(0.2), ipc1)));
		
		init.add(ipc1); // ERROR
		
		return init;
	}
	
	public static Goal goal() throws Exception {
		Precondition gd1 = new EQ(new MyNumber(1), new FHead(new FunctionSymbol("f1"), new Constant("c1"), new Variable("v1")));
		Goal goal = new PreconditionMetricGoal(new GoalRewardSpec(gd1, new MyNumber(1)), new Maximize(FHead.REWARD));
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

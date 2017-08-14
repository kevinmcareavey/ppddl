package main;

import java.util.ArrayList;
import java.util.List;

import external.Planner;
import external.planner.FF;
import external.planner.MetricFF;
import ppddl.ActionSchemata;
import ppddl.Atom;
import ppddl.AtomSkeleton;
import ppddl.Domain;
import ppddl.FunctionSkeleton;
import ppddl.Precondition;
import ppddl.Goal;
import ppddl.GoalSpec;
import ppddl.Init;
import ppddl.Effect;
import ppddl.Name;
import ppddl.PredicatesDef;
import ppddl.Problem;
import ppddl.Requirements;
import ppddl.TypedList;
import ppddl.annotation.AnnotatedEffect;
import ppddl.annotation.AnnotatedInitialFormula;
import ppddl.arithmetic_expression.Function;
import ppddl.arithmetic_expression.MyNumber;
import ppddl.arithmetic_expression.Negative;
import ppddl.arithmetic_expression.binary_operation.Addition;
import ppddl.arithmetic_expression.binary_operation.Division;
import ppddl.arithmetic_expression.binary_operation.Multiplication;
import ppddl.arithmetic_expression.binary_operation.Subtraction;
import ppddl.arithmetic_expression.my_number.Probability;
import ppddl.effect.binary.ConditionalEffect;
import ppddl.effect.binary.UniversalEffect;
import ppddl.effect.binary.assignment_operation.Assign;
import ppddl.effect.binary.assignment_operation.ScaleDown;
import ppddl.effect.binary.assignment_operation.ScaleUp;
import ppddl.effect.binary.assignment_operation.additiveop.Decrease;
import ppddl.effect.binary.assignment_operation.additiveop.Increase;
import ppddl.effect.nary.ConjunctionEffect;
import ppddl.effect.nary.ProbabilisticEffect;
import ppddl.effect.unary.NegativeAtomicEffect;
import ppddl.effect.unary.PositiveAtomicEffect;
import ppddl.functiontypedlist.Functions;
import ppddl.goal.PreconditionGoal;
import ppddl.initial_formula.DeterministicInitialFormula;
import ppddl.initial_formula.ProbabilisticInitialFormula;
import ppddl.initial_formula.deterministic.ConjunctionInitialFormula;
import ppddl.initial_formula.deterministic.terminal.AtomicInitFormula;
import ppddl.initial_formula.deterministic.terminal.EQInitialFormula;
import ppddl.metricspec.Maximize;
import ppddl.name.ActionSymbol;
import ppddl.name.FunctionSymbol;
import ppddl.name.Predicate;
import ppddl.precondition.binary.EqualityPrecondition;
import ppddl.precondition.binary.ImplicationPrecondition;
import ppddl.precondition.binary.numericexpression.EQ;
import ppddl.precondition.binary.numericexpression.GE;
import ppddl.precondition.binary.numericexpression.GT;
import ppddl.precondition.binary.numericexpression.LE;
import ppddl.precondition.binary.numericexpression.LT;
import ppddl.precondition.binary.quantified.ExistentialPrecondition;
import ppddl.precondition.binary.quantified.UniversalPrecondition;
import ppddl.precondition.nary.ConjunctionPrecondition;
import ppddl.precondition.nary.DisjunctionPrecondition;
import ppddl.precondition.unary.AtomicPrecondition;
import ppddl.precondition.unary.NegationPrecondition;
import ppddl.term.Constant;
import ppddl.term.Variable;
import ppddl.type.UnionType;
import ppddl.type.SimpleType;
import ppddl.typedlist.Constants;
import ppddl.typedlist.Objects;
import ppddl.typedlist.Types;

public class Main {
	
	public static Requirements requireDef() {
		Requirements requireDef = new Requirements();
		
//		requireDef.enableSTRIPS();
		requireDef.enableTyping();
//		requireDef.enableEquality();
//		requireDef.enableNegativePreconditions();
//		requireDef.enableDisjunctivePreconditions();
//		requireDef.enableExistentialPreconditions();
//		requireDef.enableUniversalPreconditions();
//		requireDef.enableQuantifiedPreconditions();
//		requireDef.enableConditionalEffects();
		requireDef.enableProbabilisticEffects();
		requireDef.enableRewards();
		requireDef.enableFluents();
//		requireDef.enableADL();
//		requireDef.enableMDP();
		
		return requireDef;
	}
	
	public static Types typesDef() throws Exception {
		Types typesDef = new Types();
		
		typesDef.add(new SimpleType("st1"));
		
		typesDef.add(new SimpleType("st3"), new SimpleType("st2"));
		
		typesDef.add(new SimpleType("st5"), new SimpleType("st4"));
		typesDef.add(new SimpleType("st6"), new SimpleType("st4"));
		
		UnionType ut1 = new UnionType(new SimpleType("st7"), new SimpleType("st8"));
		typesDef.add(new SimpleType("st9"), ut1);
		
		UnionType ut2 = new UnionType(new SimpleType("st10"), new SimpleType("st11"));
		typesDef.add(new SimpleType("st12"), ut2);
		typesDef.add(new SimpleType("st13"), ut2);
		
		return typesDef;
	}
	
	public static Constants constantsDef() throws Exception {
		Constants constantsDef = new Constants();
		
		constantsDef.add(new Constant("c1"));
		
		UnionType c1 = new UnionType(new SimpleType("pt1"));
		constantsDef.add(new Constant("c2"), c1);
		
		UnionType c2 = new UnionType(new SimpleType("pt2"), new SimpleType("pt3"));
		constantsDef.add(new Constant("c3"), c2);
		
		UnionType c3 = new UnionType(new SimpleType("pt4"));
		constantsDef.add(new Constant("c4"), c3);
		constantsDef.add(new Constant("c5"), c3);
		
		UnionType c4 = new UnionType(new SimpleType("pt5"), new SimpleType("pt6"));
		constantsDef.add(new Constant("c6"), c4);
		constantsDef.add(new Constant("c7"), c4);
		
		return constantsDef;
	}
	
	public static PredicatesDef predicatesDef() throws Exception {
		PredicatesDef predicatesDef = new PredicatesDef();
		
		Predicate p1 = new Predicate("p1");
		predicatesDef.add(new AtomSkeleton(p1));
		
		Predicate p2 = new Predicate("p2");
		TypedList<Variable> tlv1 = new TypedList<Variable>();
		tlv1.add(new Variable("v1"));
		predicatesDef.add(new AtomSkeleton(p2, tlv1));
		
		Predicate p3 = new Predicate("p3");
		TypedList<Variable> tlv2 = new TypedList<Variable>();
		tlv2.add(new Variable("v2"));
		tlv2.add(new Variable("v3"));
		predicatesDef.add(new AtomSkeleton(p3, tlv2));
		
		Predicate p4 = new Predicate("p4");
		TypedList<Variable> tlv3 = new TypedList<Variable>();
		tlv3.add(new Variable("v4"), new UnionType(new SimpleType("pt1")));
		predicatesDef.add(new AtomSkeleton(p4, tlv3));
		
		Predicate p5 = new Predicate("p5");
		TypedList<Variable> tlv4 = new TypedList<Variable>();
		tlv4.add(new Variable("v5"), new UnionType(new SimpleType("pt2"), new SimpleType("pt3")));
		predicatesDef.add(new AtomSkeleton(p5, tlv4));
		
		Predicate p6 = new Predicate("p6");
		TypedList<Variable> tlv5 = new TypedList<Variable>();
		UnionType c1 = new UnionType(new SimpleType("pt4"));
		tlv5.add(new Variable("v6"), c1);
		tlv5.add(new Variable("v7"), c1);
		predicatesDef.add(new AtomSkeleton(p6, tlv5));
		
		Predicate p7 = new Predicate("p7");
		TypedList<Variable> tlv6 = new TypedList<Variable>();
		UnionType c2 = new UnionType(new SimpleType("pt5"), new SimpleType("pt6"));
		tlv6.add(new Variable("v8"), c2);
		tlv6.add(new Variable("v9"), c2);
		predicatesDef.add(new AtomSkeleton(p7, tlv6));
		
		return predicatesDef;
	}
	
	public static Functions functionsDef() throws Exception {
		Functions functionsDef = new Functions();
		
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs1")));
		
		TypedList<Variable> tlv1 = new TypedList<Variable>();
		tlv1.add(new Variable("v1"));
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs2"), tlv1));
		
		TypedList<Variable> tlv2 = new TypedList<Variable>();
		tlv2.add(new Variable("v2"));
		tlv2.add(new Variable("v3"));
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs3"), tlv2));
		
		TypedList<Variable> tlv3 = new TypedList<Variable>();
		tlv3.add(new Variable("v4"), new UnionType(new SimpleType("pt1")));
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs4"), tlv3));
		
		TypedList<Variable> tlv4 = new TypedList<Variable>();
		tlv4.add(new Variable("v5"), new UnionType(new SimpleType("pt2"), new SimpleType("pt3")));
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs5"), tlv4));
		
		TypedList<Variable> tlv5 = new TypedList<Variable>();
		UnionType c1 = new UnionType(new SimpleType("pt4"));
		tlv5.add(new Variable("v6"), c1);
		tlv5.add(new Variable("v7"), c1);
		functionsDef.add(new FunctionSkeleton(new FunctionSymbol("fs6"), tlv5));
		
		TypedList<Variable> tlv6 = new TypedList<Variable>();
		UnionType c2 = new UnionType(new SimpleType("pt5"), new SimpleType("pt6"));
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
		gds.add(new NegationPrecondition(new AtomicPrecondition(new Predicate("p1"))));
		gds.add(new NegationPrecondition(new AtomicPrecondition(new Predicate("p1"), new Constant("c1"), new Variable("v1"))));
		gds.add(new EqualityPrecondition(new Constant("c1"), new Constant("c2")));
		gds.add(new EqualityPrecondition(new Variable("v1"), new Variable("v2")));
		gds.add(new EqualityPrecondition(new Constant("c1"), new Variable("v1")));
		gds.add(new EqualityPrecondition(new Variable("v1"), new Constant("c1")));
		gds.add(new NegationPrecondition(new EqualityPrecondition(new Constant("c1"), new Constant("c2"))));
		gds.add(new NegationPrecondition(new EqualityPrecondition(new Variable("v1"), new Variable("v2"))));
		gds.add(new NegationPrecondition(new EqualityPrecondition(new Constant("c1"), new Variable("v1"))));
		gds.add(new NegationPrecondition(new EqualityPrecondition(new Variable("v1"), new Constant("c1"))));
		gds.add(new ConjunctionPrecondition(new AtomicPrecondition(new Predicate("p1")), new AtomicPrecondition(new Predicate("p2"))));
		gds.add(new DisjunctionPrecondition(new AtomicPrecondition(new Predicate("p1")), new AtomicPrecondition(new Predicate("p2"))));
		gds.add(new ImplicationPrecondition(new AtomicPrecondition(new Predicate("p1")), new AtomicPrecondition(new Predicate("p2"))));
		
		TypedList<Variable> tl1 = new TypedList<Variable>();
		tl1.add(new Variable("v1"));
		
		gds.add(new ExistentialPrecondition(tl1, new AtomicPrecondition(new Predicate("p1"))));
		gds.add(new UniversalPrecondition(tl1, new AtomicPrecondition(new Predicate("p1"))));
		
		gds.add(new EQ(new MyNumber(1), new MyNumber(2)));
		gds.add(new EQ(new MyNumber(1), new Function(new FunctionSymbol("f1"))));
		gds.add(new EQ(new MyNumber(1), new Function(new FunctionSymbol("f1"), new Constant("c1"))));
		gds.add(new EQ(new MyNumber(1), new Function(new FunctionSymbol("f1"), new Variable("v1"))));
		gds.add(new EQ(new MyNumber(1), new Function(new FunctionSymbol("f1"), new Constant("c1"), new Variable("v1"))));
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
		effects.add(new ConjunctionEffect(new PositiveAtomicEffect(new Predicate("p1")), new PositiveAtomicEffect(new Predicate("p2"))));
		
		TypedList<Variable> tl1 = new TypedList<Variable>();
		tl1.add(new Variable("v1"));
		
		effects.add(new UniversalEffect(tl1, new PositiveAtomicEffect(new Predicate("p1"))));
		effects.add(new ConditionalEffect(new AtomicPrecondition(new Predicate("p1")), new PositiveAtomicEffect(new Predicate("p2"))));
		
		AnnotatedEffect pe1 = new AnnotatedEffect(new Probability(0.8), new PositiveAtomicEffect(new Predicate("p1")));
		AnnotatedEffect pe2 = new AnnotatedEffect(new Probability(0.2), new PositiveAtomicEffect(new Predicate("p1")));
		
		effects.add(new ProbabilisticEffect(pe1, pe2));
		
		return effects;
	}
	
	public static List<ActionSchemata> actionDefs() throws Exception {
		List<ActionSchemata> structureDefs = new ArrayList<ActionSchemata>();
		
		structureDefs.add(new ActionSchemata(new ActionSymbol("as1")));
		structureDefs.add(new ActionSchemata(new ActionSymbol("as2"), new AtomicPrecondition(new Predicate("p1")), new PositiveAtomicEffect(new Predicate("p2"))));
		
		AnnotatedEffect pe1 = new AnnotatedEffect(new Probability(0.8), new PositiveAtomicEffect(new Predicate("p1")));
		AnnotatedEffect pe2 = new AnnotatedEffect(new Probability(0.2), new PositiveAtomicEffect(new Predicate("p1")));
		
		structureDefs.add(new ActionSchemata(new ActionSymbol("as1"), new EQ(new MyNumber(1), new Function(new FunctionSymbol("f1"), new Constant("c1"), new Variable("v1"))), new ProbabilisticEffect(pe1, pe2)));
		
		return structureDefs;
	}
	
	public static Domain domain() throws Exception {
		Domain domain = new Domain(new Name("d1"));
		domain.setRequireDef(requireDef());
		domain.setTypesDef(typesDef());
		domain.setConstantsDef(constantsDef());
		domain.setPredicatesDef(predicatesDef());
		domain.setFunctionsDef(functionsDef());
		domain.setActionDefs(actionDefs());
		
		domain.validate();
		
		return domain;
	}
	
	public static Objects objectsDef() throws Exception {
		Objects objectsDef = new Objects();
		
		objectsDef.add(new Constant("c1"));
		
		UnionType c1 = new UnionType(new SimpleType("pt1"));
		objectsDef.add(new Constant("c2"), c1);
		
		UnionType c2 = new UnionType(new SimpleType("pt2"), new SimpleType("pt3"));
		objectsDef.add(new Constant("c3"), c2);
		
		UnionType c3 = new UnionType(new SimpleType("pt4"));
		objectsDef.add(new Constant("c4"), c3);
		objectsDef.add(new Constant("c5"), c3);
		
		UnionType c4 = new UnionType(new SimpleType("pt5"), new SimpleType("pt6"));
		objectsDef.add(new Constant("c6"), c4);
		objectsDef.add(new Constant("c7"), c4);
		
		return objectsDef;
	}
	
	public static Init init() throws Exception {
		Init init = new Init();
		
		init.add(new AtomicInitFormula(new Atom(new Predicate("p1"))));
		init.add(new AtomicInitFormula(new Atom(new Predicate("p2"), new Constant("c1"))));
		init.add(new AtomicInitFormula(new Atom(new Predicate("p3"), new Variable("v1"))));
		init.add(new EQInitialFormula(new Function(new FunctionSymbol("f1")), new MyNumber(1)));
		init.add(new EQInitialFormula(new Function(new FunctionSymbol("f1"), new Constant("c2")), new MyNumber(2)));
		
		DeterministicInitialFormula ip1 = new AtomicInitFormula(new Atom(new Predicate("p4")));
		DeterministicInitialFormula ip2 = new AtomicInitFormula(new Atom(new Predicate("p5")));
		init.add(new ProbabilisticInitialFormula(new AnnotatedInitialFormula(new Probability(0.8), ip1), new AnnotatedInitialFormula(new Probability(0.2), ip2)));
		
		DeterministicInitialFormula ipc1 = new ConjunctionInitialFormula(new AtomicInitFormula(new Atom(new Predicate("p6"))), new AtomicInitFormula(new Atom(new Predicate("p7"))));
		init.add(new ProbabilisticInitialFormula(new AnnotatedInitialFormula(new Probability(0.8), ip1), new AnnotatedInitialFormula(new Probability(0.2), ipc1)));
		
		return init;
	}
	
	public static Goal goal() throws Exception {
		Precondition gd1 = new EQ(new MyNumber(1), new Function(new FunctionSymbol("f1"), new Constant("c1"), new Variable("v1")));
		Goal goal = new PreconditionGoal(new GoalSpec(gd1, new MyNumber(1)), new Maximize(Function.REWARD));
		return goal;
	}
	
	public static Problem problem() throws Exception {
		Problem problem = new Problem(new Name("p1"), new Name("d1"));
		problem.setRequireDef(requireDef());
		problem.setObjectsDef(objectsDef());
		problem.setInit(init());
		problem.setGoal(goal());
		
		problem.validate();
		
		return problem;
	}
	
	public static Domain adlDomain() throws Exception {
		Domain domain = new Domain("miconic");
		
		domain.getRequireDef().enableADL();
		domain.getRequireDef().enableTyping();
		
		SimpleType passengerType = new SimpleType("passenger");
		SimpleType objectType = new SimpleType("object");
		SimpleType floorType = new SimpleType("floor");
		
		domain.getTypesDef().add(passengerType, objectType);
		domain.getTypesDef().add(floorType, objectType);
		
		Predicate originPredicate = new Predicate("origin");
		Predicate destinPredicate = new Predicate("destin");
		Predicate abovePredicate = new Predicate("above");
		Predicate boardedPredicate = new Predicate("boarded");
		Predicate servedPredicate = new Predicate("served");
		Predicate liftAtPredicate = new Predicate("lift-at");
		
		Variable personVariable = new Variable("person");
		Variable floorVariable = new Variable("floor");
		Variable floor1Variable = new Variable("floor1");
		Variable floor2Variable = new Variable("floor2");
		
		TypedList<Variable> originVariables = new TypedList<Variable>();
		originVariables.add(personVariable, passengerType);
		originVariables.add(floorVariable, floorType);
		domain.getPredicatesDef().add(new AtomSkeleton(originPredicate, originVariables));
		
		TypedList<Variable> destinVariables = new TypedList<Variable>();
		destinVariables.add(personVariable, passengerType);
		destinVariables.add(floorVariable, floorType);
		domain.getPredicatesDef().add(new AtomSkeleton(destinPredicate, destinVariables));
		
		TypedList<Variable> aboveVariables = new TypedList<Variable>();
		aboveVariables.add(floor1Variable, floorType);
		aboveVariables.add(floor2Variable, floorType);
		domain.getPredicatesDef().add(new AtomSkeleton(abovePredicate, aboveVariables));
		
		TypedList<Variable> boardedVariables = new TypedList<Variable>();
		boardedVariables.add(personVariable, passengerType);
		domain.getPredicatesDef().add(new AtomSkeleton(boardedPredicate, boardedVariables));
		
		TypedList<Variable> servedVariables = new TypedList<Variable>();
		servedVariables.add(personVariable, passengerType);
		domain.getPredicatesDef().add(new AtomSkeleton(servedPredicate, servedVariables));
		
		TypedList<Variable> liftAtVariables = new TypedList<Variable>();
		liftAtVariables.add(floorVariable, floorType);
		domain.getPredicatesDef().add(new AtomSkeleton(liftAtPredicate, liftAtVariables));
		
		Variable fVariable = new Variable("f");
		Variable pVariable = new Variable("p");
		
		TypedList<Variable> stopVariables = new TypedList<Variable>();
		stopVariables.add(fVariable, floorType);
		Precondition stopPrecondition = new AtomicPrecondition(liftAtPredicate, fVariable);
		TypedList<Variable> forallVariables = new TypedList<Variable>();
		forallVariables.add(pVariable, passengerType);
		Effect stopEffect = new ConjunctionEffect(new UniversalEffect(forallVariables, new ConditionalEffect(new ConjunctionPrecondition(new AtomicPrecondition(boardedPredicate, pVariable), new AtomicPrecondition(destinPredicate, pVariable, fVariable)), new ConjunctionEffect(new NegativeAtomicEffect(boardedPredicate, pVariable), new PositiveAtomicEffect(servedPredicate, pVariable)))), new UniversalEffect(forallVariables, new ConditionalEffect(new ConjunctionPrecondition(new AtomicPrecondition(originPredicate, pVariable, fVariable), new NegationPrecondition(new AtomicPrecondition(servedPredicate, pVariable))), new PositiveAtomicEffect(boardedPredicate, pVariable))));
		domain.getActionDefs().add(new ActionSchemata(new ActionSymbol("stop"), stopVariables, stopPrecondition, stopEffect));
		
		Variable f1Variable = new Variable("f1");
		Variable f2Variable = new Variable("f2");
		
		TypedList<Variable> upVariables = new TypedList<Variable>();
		upVariables.add(f1Variable, floorType);
		upVariables.add(f2Variable, floorType);
		Precondition upPrecondition = new ConjunctionPrecondition(new AtomicPrecondition(liftAtPredicate, f1Variable), new AtomicPrecondition(abovePredicate, f1Variable, f2Variable));
		Effect upEffect = new ConjunctionEffect(new PositiveAtomicEffect(liftAtPredicate, f2Variable), new NegativeAtomicEffect(liftAtPredicate, f1Variable));
		domain.getActionDefs().add(new ActionSchemata(new ActionSymbol("up"), upVariables, upPrecondition, upEffect));
		
		TypedList<Variable> downVariables = new TypedList<Variable>();
		downVariables.add(f1Variable, floorType);
		downVariables.add(f2Variable, floorType);
		Precondition downPrecondition = new ConjunctionPrecondition(new AtomicPrecondition(liftAtPredicate, f1Variable), new AtomicPrecondition(abovePredicate, f2Variable, f1Variable));
		Effect downEffect = new ConjunctionEffect(new PositiveAtomicEffect(liftAtPredicate, f2Variable), new NegativeAtomicEffect(liftAtPredicate, f1Variable));
		domain.getActionDefs().add(new ActionSchemata(new ActionSymbol("down"), downVariables, downPrecondition, downEffect));
		
		return domain;
	}
	
	public static Problem adlProblem() throws Exception {
		Problem problem = new Problem("mixed-f2-p1-u0-v0-g0-a0-n0-A0-B0-N0-F0-r0", "miconic");
		
		Constant p0Constant = new Constant("p0");
		Constant f0Constant = new Constant("f0");
		Constant f1Constant = new Constant("f1");
		
		problem.getObjectsDef().add(p0Constant, new SimpleType("passenger"));
		problem.getObjectsDef().add(f0Constant, new SimpleType("floor"));
		problem.getObjectsDef().add(f1Constant, new SimpleType("floor"));
		
		problem.getInit().add(new AtomicInitFormula(new Predicate("above"), f0Constant, f1Constant));
		problem.getInit().add(new AtomicInitFormula(new Predicate("origin"), p0Constant, f1Constant));
		problem.getInit().add(new AtomicInitFormula(new Predicate("destin"), p0Constant, f0Constant));
		problem.getInit().add(new AtomicInitFormula(new Predicate("lift-at"), f0Constant));
		
		problem.setGoal(new PreconditionGoal(new GoalSpec(new AtomicPrecondition(new Predicate("served"), p0Constant))));
		
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
//			System.out.println(domain());
//			System.out.println(objectsDef());
//			System.out.println(init());
//			System.out.println(goal());
//			System.out.println(problem());
			
			if(args.length != 0 && args.length != 2) {
				throw new Exception("invalid number of arguments");
			}
			Planner planner;
			if(args.length == 0) {
				planner = new FF("/Users/kevin/Downloads/Planners/FF-v2.3-big-parse-suda/ff");
			} else if(args[0].equals("ff")) {
				planner = new FF(args[1]);
			} else if(args[0].equals("metric-ff")) {
				planner = new MetricFF(args[1]);
			} else {
				throw new Exception("unknown planner");
			}
			
//			System.out.println(ff.run("/Users/kevin/Downloads/Benchmarks/adl-domain.pddl", "/Users/kevin/Downloads/Benchmarks/adl-problem.pddl"));
			System.out.println(planner.run(adlDomain(), adlProblem()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

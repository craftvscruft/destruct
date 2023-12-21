// Generated from Destruct.g4 by ANTLR 4.13.1
package antlrgen.destruct;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DestructParser}.
 */
public interface DestructListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DestructParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(DestructParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(DestructParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(DestructParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(DestructParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#ruleTarget}.
	 * @param ctx the parse tree
	 */
	void enterRuleTarget(DestructParser.RuleTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#ruleTarget}.
	 * @param ctx the parse tree
	 */
	void exitRuleTarget(DestructParser.RuleTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#targetSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTargetSpecifier(DestructParser.TargetSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#targetSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTargetSpecifier(DestructParser.TargetSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(DestructParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(DestructParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#destruct}.
	 * @param ctx the parse tree
	 */
	void enterDestruct(DestructParser.DestructContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#destruct}.
	 * @param ctx the parse tree
	 */
	void exitDestruct(DestructParser.DestructContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#destructRest}.
	 * @param ctx the parse tree
	 */
	void enterDestructRest(DestructParser.DestructRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#destructRest}.
	 * @param ctx the parse tree
	 */
	void exitDestructRest(DestructParser.DestructRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#rest}.
	 * @param ctx the parse tree
	 */
	void enterRest(DestructParser.RestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#rest}.
	 * @param ctx the parse tree
	 */
	void exitRest(DestructParser.RestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(DestructParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(DestructParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#destructPair}.
	 * @param ctx the parse tree
	 */
	void enterDestructPair(DestructParser.DestructPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#destructPair}.
	 * @param ctx the parse tree
	 */
	void exitDestructPair(DestructParser.DestructPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#destructDefault}.
	 * @param ctx the parse tree
	 */
	void enterDestructDefault(DestructParser.DestructDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#destructDefault}.
	 * @param ctx the parse tree
	 */
	void exitDestructDefault(DestructParser.DestructDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(DestructParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(DestructParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(DestructParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(DestructParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#destructValue}.
	 * @param ctx the parse tree
	 */
	void enterDestructValue(DestructParser.DestructValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#destructValue}.
	 * @param ctx the parse tree
	 */
	void exitDestructValue(DestructParser.DestructValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DestructParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DestructParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#destructArr}.
	 * @param ctx the parse tree
	 */
	void enterDestructArr(DestructParser.DestructArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#destructArr}.
	 * @param ctx the parse tree
	 */
	void exitDestructArr(DestructParser.DestructArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#destructArrValue}.
	 * @param ctx the parse tree
	 */
	void enterDestructArrValue(DestructParser.DestructArrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#destructArrValue}.
	 * @param ctx the parse tree
	 */
	void exitDestructArrValue(DestructParser.DestructArrValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(DestructParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(DestructParser.ArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#arrValue}.
	 * @param ctx the parse tree
	 */
	void enterArrValue(DestructParser.ArrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#arrValue}.
	 * @param ctx the parse tree
	 */
	void exitArrValue(DestructParser.ArrValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DestructParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DestructParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DestructParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DestructParser.NumberContext ctx);
}
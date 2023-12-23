// Generated from Destruct.g4 by ANTLR 4.13.1
package antlrgen.destruct;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DestructParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DestructVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DestructParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(DestructParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#ruleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleStatement(DestructParser.RuleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#ruleTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleTarget(DestructParser.RuleTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#targetSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetSpecifier(DestructParser.TargetSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(DestructParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#transformed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformed(DestructParser.TransformedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#destruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestruct(DestructParser.DestructContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#destructRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructRest(DestructParser.DestructRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRest(DestructParser.RestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(DestructParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#destructPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructPair(DestructParser.DestructPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#destructDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructDefault(DestructParser.DestructDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(DestructParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(DestructParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#destructValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructValue(DestructParser.DestructValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DestructParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#destructArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructArr(DestructParser.DestructArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#destructArrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructArrValue(DestructParser.DestructArrValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(DestructParser.ArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#arrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrValue(DestructParser.ArrValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DestructParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DestructParser.NumberContext ctx);
}
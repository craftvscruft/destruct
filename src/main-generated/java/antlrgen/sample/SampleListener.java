// Generated from Sample.g4 by ANTLR 4.13.1
package antlrgen.sample;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SampleParser}.
 */
public interface SampleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SampleParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(SampleParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(SampleParser.AContext ctx);
}
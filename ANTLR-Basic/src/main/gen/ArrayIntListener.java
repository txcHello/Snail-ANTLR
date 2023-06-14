// Generated from G:/snail-ANTLR/ANTLR-Basic/src/main/resources\ArrayInt.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArrayIntParser}.
 */
public interface ArrayIntListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArrayIntParser#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(ArrayIntParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayIntParser#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(ArrayIntParser.ArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayIntParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ArrayIntParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayIntParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ArrayIntParser.ValueContext ctx);
}
// Generated from G:/snail-ANTLR/ANTLR-Basic/src/main/resources\ArrayInt.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArrayIntParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArrayIntVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArrayIntParser#arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(ArrayIntParser.ArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArrayIntParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ArrayIntParser.ValueContext ctx);
}
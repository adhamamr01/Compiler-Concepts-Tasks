// Generated from C:/Users/adham/CompilerTask/Task8/src\task8.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link task8Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface task8Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link task8Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(task8Parser.StartContext ctx);
}
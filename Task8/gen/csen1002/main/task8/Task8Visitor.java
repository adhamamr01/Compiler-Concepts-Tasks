// Generated from C:/Users/adham/CompilerTask/Task8/src/csen1002/main/task8\task8.g4 by ANTLR 4.10.1
package csen1002.main.task8;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Task8Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Task8Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Task8Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(Task8Parser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task8Parser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(Task8Parser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task8Parser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(Task8Parser.AContext ctx);
}
// Generated from /Users/scientiacluster/IdeaProjects/Romano/src/Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#thousand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThousand(ExprParser.ThousandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#hundred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHundred(ExprParser.HundredContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#ten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTen(ExprParser.TenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(ExprParser.UnitContext ctx);
}
// Generated from R.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RParser}.
 */
public interface RListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(RParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(RParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RParser#expr_or_assign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or_assign(RParser.Expr_or_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link RParser#expr_or_assign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or_assign(RParser.Expr_or_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link RParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(RParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(RParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RParser#formList}.
	 * @param ctx the parse tree
	 */
	void enterFormList(RParser.FormListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RParser#formList}.
	 * @param ctx the parse tree
	 */
	void exitFormList(RParser.FormListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(RParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link RParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(RParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link RParser#subList}.
	 * @param ctx the parse tree
	 */
	void enterSubList(RParser.SubListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RParser#subList}.
	 * @param ctx the parse tree
	 */
	void exitSubList(RParser.SubListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(RParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link RParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(RParser.SubContext ctx);
}
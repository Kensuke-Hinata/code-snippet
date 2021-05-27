// Generated from JSON2XML.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSON2XMLParser}.
 */
public interface JSON2XMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSON2XMLParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JSON2XMLParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSON2XMLParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JSON2XMLParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnObject}
	 * labeled alternative in {@link JSON2XMLParser#object}.
	 * @param ctx the parse tree
	 */
	void enterAnObject(JSON2XMLParser.AnObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnObject}
	 * labeled alternative in {@link JSON2XMLParser#object}.
	 * @param ctx the parse tree
	 */
	void exitAnObject(JSON2XMLParser.AnObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyObject}
	 * labeled alternative in {@link JSON2XMLParser#object}.
	 * @param ctx the parse tree
	 */
	void enterEmptyObject(JSON2XMLParser.EmptyObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyObject}
	 * labeled alternative in {@link JSON2XMLParser#object}.
	 * @param ctx the parse tree
	 */
	void exitEmptyObject(JSON2XMLParser.EmptyObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSON2XMLParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(JSON2XMLParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSON2XMLParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(JSON2XMLParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayOfValues}
	 * labeled alternative in {@link JSON2XMLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayOfValues(JSON2XMLParser.ArrayOfValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayOfValues}
	 * labeled alternative in {@link JSON2XMLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayOfValues(JSON2XMLParser.ArrayOfValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyArray}
	 * labeled alternative in {@link JSON2XMLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterEmptyArray(JSON2XMLParser.EmptyArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyArray}
	 * labeled alternative in {@link JSON2XMLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitEmptyArray(JSON2XMLParser.EmptyArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link JSON2XMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterString(JSON2XMLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link JSON2XMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitString(JSON2XMLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link JSON2XMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterAtom(JSON2XMLParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link JSON2XMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitAtom(JSON2XMLParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link JSON2XMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(JSON2XMLParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link JSON2XMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(JSON2XMLParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link JSON2XMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(JSON2XMLParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link JSON2XMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(JSON2XMLParser.ArrayValueContext ctx);
}
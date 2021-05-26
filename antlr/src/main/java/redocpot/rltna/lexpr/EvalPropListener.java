import java.io.FileInputStream;
import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class EvalPropListener extends LExprBaseListener {
    ParseTreeProperty<Integer> values = new ParseTreeProperty<Integer>();

    public void setValue(ParseTree node, int value) {
        values.put(node, value);
    }

    public int getValue(ParseTree node) {
        return values.get(node);
    }

    public void exitInt(LExprParser.IntContext ctx) {
        String intText = ctx.INT().getText();
        setValue(ctx, Integer.valueOf(intText));
    }

    public void exitAdd(LExprParser.AddContext ctx) {
        int left = getValue(ctx.e(0));
        int right = getValue(ctx.e(1));
        setValue(ctx, left + right);
    }

    public void exitMult(LExprParser.MultContext ctx) {
        int left = getValue(ctx.e(0));
        int right = getValue(ctx.e(1));
        setValue(ctx, left * right);
    }

    public void exitS(LExprParser.SContext ctx) {
        setValue(ctx, getValue(ctx.e()));
    }

    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("./data");
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(is);
        LExprLexer lExprLexer = new LExprLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lExprLexer);
        LExprParser lExprParser = new LExprParser(commonTokenStream);
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        EvalPropListener evalPropListener = new EvalPropListener();
        ParseTree parseTree = lExprParser.s();
        parseTreeWalker.walk(evalPropListener, parseTree);
        int result = evalPropListener.getValue(parseTree);
        System.out.println("prop listener result = " + result);
    }
}

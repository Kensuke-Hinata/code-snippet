import java.io.FileInputStream;
import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class EvalStackListener extends LExprBaseListener {
    Stack<Integer> stack = new Stack<Integer>();

    public void exitMult(LExprParser.MultContext ctx) {
        int right = stack.pop();
        int left = stack.pop();
        stack.push(left * right);
    }

    public void exitAdd(LExprParser.AddContext ctx) {
        int right = stack.pop();
        int left = stack.pop();
        stack.push(left + right);
    }

    public void exitInt(LExprParser.IntContext ctx) {
        stack.push(Integer.valueOf(ctx.INT().getText()));
    }

    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("./data");
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(is);
        LExprLexer lExprLexer = new LExprLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lExprLexer);
        LExprParser lExprParser = new LExprParser(commonTokenStream);
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        EvalStackListener evalStackListener = new EvalStackListener();
        parseTreeWalker.walk(evalStackListener, lExprParser.s());
        int result = evalStackListener.stack.pop();
        System.out.println("stack listener result = " + result);
    }
}

import java.io.FileInputStream;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class EvalVisitor extends LExprBaseVisitor<Integer> {
    public Integer visitMult(LExprParser.MultContext ctx) {
        return visit(ctx.e(0)) * visit(ctx.e(1));
    }

    public Integer visitAdd(LExprParser.AddContext ctx) {
        return visit(ctx.e(0)) + visit(ctx.e(1));
    }

    public Integer visitInt(LExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }
    
    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("./data");
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(is);
        LExprLexer lExprLexer = new LExprLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lExprLexer);
        LExprParser lExprParser = new LExprParser(commonTokenStream);
        EvalVisitor evalVisitor = new EvalVisitor();
        int result = evalVisitor.visit(lExprParser.s());
        System.out.println("visitor result = " + result);
    }
}

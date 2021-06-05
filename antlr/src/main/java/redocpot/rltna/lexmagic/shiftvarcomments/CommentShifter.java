import java.util.List;
import java.io.FileInputStream;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;

public class CommentShifter extends CymbolBaseListener {
    BufferedTokenStream tokens;
    TokenStreamRewriter rewriter;

    public CommentShifter(BufferedTokenStream tokens) {
        this.tokens = tokens;
        rewriter = new TokenStreamRewriter(tokens);
    }

    @Override
    public void exitVariableDeclare(CymbolParser.VariableDeclareContext ctx) {
        Token semi = ctx.getStop();
        int idx = semi.getTokenIndex();
        List<Token> commentChannel = tokens.getHiddenTokensToRight(
                idx, CymbolLexer.COMMENTS);
        if (commentChannel != null) {
            Token comment = commentChannel.get(0);
            if (comment != null) {
                String text = comment.getText().substring(2);
                String newComment = "/* " + text.trim() + " */\n";
                rewriter.insertBefore(ctx.start, newComment);
                rewriter.replace(comment, "\n");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("./prog.cymbol");
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(is);
        CymbolLexer lexer = new CymbolLexer(antlrInputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser parser = new CymbolParser(tokens);
        RuleContext tree = parser.file();
        ParseTreeWalker walker = new ParseTreeWalker();
        CommentShifter shifter = new CommentShifter(tokens);
        walker.walk(shifter, tree);
        System.out.println(shifter.rewriter.getText().trim());
    }
}

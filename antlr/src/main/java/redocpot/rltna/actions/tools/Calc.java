package tools;

import java.io.BufferedReader;
import java.io.ObjectInputValidation;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import tools.ExprLexer;
import tools.ExprParser;

public class Calc {
    public static void main(String[] args) throws Exception {
        ExprParser parser = new ExprParser(null);
        parser.setBuildParseTree(false);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expr;
        int line = 1;
        while ((expr = br.readLine()) != null) {
            ANTLRInputStream input = new ANTLRInputStream(expr + "\n");
            ExprLexer lexer = new ExprLexer(input);
            lexer.setLine(line);
            lexer.setCharPositionInLine(0);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser.setInputStream(tokens);
            parser.stat();
            ++ line;
        }
    }
}

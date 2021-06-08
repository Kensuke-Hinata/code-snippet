import java.io.FileInputStream;

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class EnumDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("./data");
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(is);
        EnumLexer enumLexer = new EnumLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(enumLexer);
        EnumParser enumParser = new EnumParser(commonTokenStream);
        enumParser.java5 = false;
        if (args.length > 0 && args[0].equals("-java5")) {
            enumParser.java5 = true;
        }
        enumParser.prog();
    }
}

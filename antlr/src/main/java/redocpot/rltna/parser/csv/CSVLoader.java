import java.io.FileInputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class CSVLoader extends CSVBaseListener {
    public final String EMPTY = "";
    List<Map<String, String>> rows = new ArrayList<Map<String, String>>();
    List<String> header;
    List<String> currentRowFieldValues;

    public void enterRow(CSVParser.RowContext ctx) {
        currentRowFieldValues = new ArrayList<String>();
    }

    public void exitRow(CSVParser.RowContext ctx) {
        if (ctx.getParent().getRuleIndex() == CSVParser.RULE_hdr) {
            return;
        }
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < currentRowFieldValues.size(); ++ i) {
            map.put(header.get(i), currentRowFieldValues.get(i));
        }
        rows.add(map);
    }

    public void exitString(CSVParser.StringContext ctx) {
        currentRowFieldValues.add(ctx.STRING().getText());
    }

    public void exitText(CSVParser.TextContext ctx) {
        currentRowFieldValues.add(ctx.TEXT().getText());
    }

    public void exitEmpty(CSVParser.EmptyContext ctx) {
        currentRowFieldValues.add(EMPTY);
    }

    public void exitHdr(CSVParser.HdrContext ctx) {
        header = new ArrayList<String>();
        header.addAll(currentRowFieldValues);
    }

    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("./data.csv");
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(is);
        CSVLexer csvLexer = new CSVLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(csvLexer);
        CSVParser csvParser = new CSVParser(commonTokenStream);
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        CSVLoader csvLoader = new CSVLoader();
        parseTreeWalker.walk(csvLoader, csvParser.file());
        System.out.println(csvLoader.rows);
    }
}

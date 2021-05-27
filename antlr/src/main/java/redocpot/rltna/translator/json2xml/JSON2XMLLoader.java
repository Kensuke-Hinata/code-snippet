import java.io.FileInputStream;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class JSON2XMLLoader extends JSON2XMLBaseListener {
    ParseTreeProperty<String> xml = new ParseTreeProperty<String>();

    static String stripQuotes(String s) {
        if (s == null || s.charAt(0) != '"') {
            return s;
        }
        return s.substring(1, s.length() - 1);
    }

    String getXML(ParseTree ctx) {
        return xml.get(ctx);
    }

    void setXML(ParseTree ctx, String s) {
        xml.put(ctx, s);
    }
    
    public void exitAtom(JSON2XMLParser.AtomContext ctx) {
        setXML(ctx, ctx.getText());
    }

    public void exitString(JSON2XMLParser.StringContext ctx) {
        setXML(ctx, stripQuotes(ctx.getText()));
    }

    public void exitObjectValue(JSON2XMLParser.ObjectValueContext ctx) {
        setXML(ctx, getXML(ctx.object()));
    }

    public void exitArrayValue(JSON2XMLParser.ArrayValueContext ctx) {
        setXML(ctx, getXML(ctx.array()));
    }

    public void exitPair(JSON2XMLParser.PairContext ctx) {
        String tag = stripQuotes(ctx.STRING().getText());
        JSON2XMLParser.ValueContext vctx = ctx.value();
        String str = String.format("<%s>%s</%s>\n", tag, getXML(vctx), tag);
        setXML(ctx, str);
    }

    public void exitAnObject(JSON2XMLParser.AnObjectContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append("\n");
        for (JSON2XMLParser.PairContext pctx : ctx.pair()) {
            buf.append(getXML(pctx));
        }
        setXML(ctx, buf.toString());
    }

    public void exitEmptyObject(JSON2XMLParser.EmptyObjectContext ctx) {
        setXML(ctx, "");
    }

    public void exitArrayOfValues(JSON2XMLParser.ArrayOfValuesContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append("\n");
        for (JSON2XMLParser.ValueContext vctx : ctx.value()) {
            buf.append("<element>");
            buf.append(getXML(vctx));
            buf.append("</element>");
            buf.append("\n");
        }
        setXML(ctx, buf.toString());
    }

    public void exitEmptyArray(JSON2XMLParser.EmptyArrayContext ctx) {
        setXML(ctx, "");
    }

    public void exitJson(JSON2XMLParser.JsonContext ctx) {
        setXML(ctx, getXML(ctx.getChild(0)));
    }

    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("./data.json");
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(is);
        JSON2XMLLexer lexer = new JSON2XMLLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        JSON2XMLParser parser = new JSON2XMLParser(commonTokenStream);
        JSON2XMLLoader loader = new JSON2XMLLoader();
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        ParseTree root = parser.json();
        parseTreeWalker.walk(loader, root);
        String result = loader.getXML(root);
        System.out.println(result);
    }
}

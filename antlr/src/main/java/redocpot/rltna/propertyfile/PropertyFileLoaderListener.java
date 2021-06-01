import java.util.Map;
import java.util.HashMap;
import java.io.FileInputStream;

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class PropertyFileLoaderListener extends PropertyFileBaseListener {
    Map<String, String> props = new HashMap<String, String>();

    public void exitProp(PropertyFileParser.PropContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.STRING().getText();
        props.put(id, value);
    }

    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream(
                "/Users/me/Code/antlr/rltna/src/main/java/redocpot/antlr/propertyfile/data.properties"
                );
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(is);
        PropertyFileLexer propertyFileLexer = new PropertyFileLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(propertyFileLexer);
        PropertyFileParser propertyFileParser = new PropertyFileParser(commonTokenStream);
        PropertyFileLoaderListener propertyFileLoaderListener = new PropertyFileLoaderListener();
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(propertyFileLoaderListener, propertyFileParser.file());
        System.out.println(propertyFileLoaderListener.props);
    }
}

import java.util.Map;
import java.util.HashMap;
import java.io.FileInputStream;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class PropertyFileLoaderVisitor extends PropertyFileBaseVisitor<Void> {
    Map<String, String> props = new HashMap<String, String>();

    public Void visitProp(PropertyFileParser.PropContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.STRING().getText();
        props.put(id, value);
        return null;
    }

    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("./data.properties");
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(is);
        PropertyFileLexer propertyFileLexer = new PropertyFileLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(propertyFileLexer);
        PropertyFileParser propertyFileParser = new PropertyFileParser(commonTokenStream);
        PropertyFileLoaderVisitor propertyFileLoaderVisitor = new PropertyFileLoaderVisitor();
        propertyFileLoaderVisitor.visit(propertyFileParser.file());
        System.out.println(propertyFileLoaderVisitor.props);
    }
}

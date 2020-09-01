import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromStream(System.in);
            ExprLexer lexer = new ExprLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExprParser parser = new ExprParser(tokens);
            ParseTree tree = parser.prog();
            // System.out.println(tree.toStringTree(parser));
        /*
        ParseTreeWalker walker = new ParseTreeWalker();
        MiListener listener = new MiListener();
        walker.walk(listener, tree);
        */
        }
        catch(Exception e) {
            System.out.println("Error"); }
    }
    public static String repeat(int n, String s) {
        return "".join("",Collections.nCopies(n, s));
    }
    public static int parse(String number) {
        return Integer.parseInt(number);
    }

}

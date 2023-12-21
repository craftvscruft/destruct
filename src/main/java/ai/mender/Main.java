package ai.mender;

import antlrgen.destruct.DestructLexer;
import antlrgen.destruct.DestructParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        CharStream inputStream = CharStreams.fromString("""
                start : { statement, moreStatements: null } => {statements}
                      | { statement, moreStatements } => {statements: [statement, ...moreStatements]};
                """
        );
        DestructListener listener = new DestructListener();
        parse(inputStream, listener, true);


    }

    private static void parse(CharStream inputStream, DestructListener listener, boolean throwOnError) {
        var lexer = new DestructLexer(inputStream);
        if (throwOnError) {
            lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        }
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        var parser = new DestructParser(commonTokenStream);
        parser.setBuildParseTree(false);

        parser.addParseListener(listener);


        if (throwOnError) {
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        }


        parser.start();
    }
}
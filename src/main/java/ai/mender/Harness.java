package ai.mender;

import antlrgen.destruct.DestructLexer;
import antlrgen.destruct.DestructParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

public class Harness {
    public static void main(String[] args) {
        String input = """
                start : { statement, moreStatements: null } => {statements}
                      | { statement, moreStatements } => {statements: [statement, ...moreStatements]};
                """;
        List<Ast.Rule> rules = parseStringToAst(input);
        System.out.println(Ast.toJson(rules));
        System.out.println(
                rules.toString()
                        .replace("Rule[", "\n  Rule[")
                        .replace("Match[", "\n    Match[")
                        .replace("DestructStep[", "\n      DestructStep[")
                        .replace("Transformed[", "\n    Transformed["));
    }

    static List<Ast.Rule> parseStringToAst(String input) {
        CharStream inputStream = CharStreams.fromString(input);
        return parse(inputStream, true).rules();
    }


    static Ast.Start parse(CharStream inputStream, boolean throwOnError) {

        var lexer = new DestructLexer(inputStream);
        if (throwOnError) {
            lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        }
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        var parser = new DestructParser(commonTokenStream);
        DestructVisitor visitor = new DestructVisitor(parser);

        if (throwOnError) {
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        }

        DestructParser.StartContext program = parser.start();

        return visitor.visitStart(program);
    }
}
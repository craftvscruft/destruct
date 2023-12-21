package ai.mender;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class AstTest {

    @Test
    public void oneRuleTwoMatches() {
        CharStream inputStream = CharStreams.fromString("""
            start : { statement, moreStatements: null } => {statements}
                  | { statement, moreStatements } => {statements: [statement, ...moreStatements]};
            """
        );
        DestructListener listener = new DestructListener();
        Main.parse(inputStream, listener, true);

        Approvals.verify(Ast.toJson(listener.rules));
    }
}

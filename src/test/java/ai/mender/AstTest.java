package ai.mender;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;


public class AstTest {

    @Test
    public void oneRuleTwoMatches() {
        String program = """
            start : { statement, moreStatements: null } => {statements}
                  | { statement, moreStatements } => {statements: [statement, ...moreStatements]};
            """;
        Approvals.verify(Ast.toJson(Harness.parseStringToAst(program)));
    }
}

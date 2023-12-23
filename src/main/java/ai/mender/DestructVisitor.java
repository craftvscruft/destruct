package ai.mender;

import antlrgen.destruct.DestructBaseVisitor;
import antlrgen.destruct.DestructParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class DestructVisitor extends DestructBaseVisitor<Ast> {

    final private DestructParser parser;

    public DestructVisitor(DestructParser parser) {
        this.parser = parser;
    }

    public String getText(ParserRuleContext ctx) {
        if (null == ctx) {
            return "";
        }
        TokenStream tokens = parser.getTokenStream();
        return tokens.getText(ctx);
    }

    public String getText(TerminalNode ctx) {
        if (null == ctx) {
            return "";
        }
        return ctx.getText();
    }

    @Override
    public Ast.Start visitStart(DestructParser.StartContext ctx) {
        return new Ast.Start(ctx.ruleStatement().stream().map(this::visitRuleStatement).toList());
    }

    @Override
    public Ast.Rule visitRuleStatement(DestructParser.RuleStatementContext ctx) {
        return new Ast.Rule(getText(ctx.ruleTarget()), ctx.match().stream().map(this::visitMatch).toList());
    }

    @Override
    public Ast.Match visitMatch(DestructParser.MatchContext ctx) {
        return new Ast.Match(this.visitDestruct(ctx.destruct()), this.visitTransformed(ctx));
    }

    private Ast.Transform visitTransformed(DestructParser.MatchContext ctx) {
        return new Ast.Transform(new ArrayList<>());
    }

    @Override
    public Ast.DestructStep visitDestruct(DestructParser.DestructContext ctx) {
        return new Ast.DestructStep("root", ctx.destructPair().stream().map(this::visitDestructPair).toList());
    }

    @Override
    public Ast.DestructStep visitDestructPair(DestructParser.DestructPairContext ctx) {
        String keyText = getText(ctx.key());
        String msg = "take key '" + keyText + "' ";
        if (ctx.destructDefault() != null) {
            String defaultText = getText(ctx.destructDefault());
            msg += "' (default '" + defaultText + "') ";
        }

//        destructValue
//        : STRING
//                | number
//                | obj
//                | destructArr
//                | LITERAL
//                | IDENTIFIER
        if (ctx.destructValue() == null) {
            msg += "store to '" + keyText + "' ";
        } else {
            boolean isValObject = ctx.destructValue().obj() != null;
            boolean isValArray = ctx.destructValue().destructArr() != null;
            boolean isValIdentifier = ctx.destructValue().IDENTIFIER() != null;
            if (isValIdentifier) {
                msg += "store to '" + getText(ctx.destructValue()) + "'";
            } else if (isValObject || isValArray) {
                msg += "destruct to '" + getText(ctx.destructValue()) + "'";
            } else {
                msg += "match '" + getText(ctx.destructValue()) + "'";
            }
        }
        return new Ast.DestructStep(msg, new ArrayList<>());
    }
}

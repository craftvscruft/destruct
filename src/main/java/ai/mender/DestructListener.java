package ai.mender;

import antlrgen.destruct.DestructBaseListener;
import antlrgen.destruct.DestructParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

public class DestructListener extends DestructBaseListener
{

    private DestructParser parser;

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
    final List<Ast.Rule> rules = new ArrayList<>();
    List<Ast.Match> ruleMatches;
    Ast.Rule rule;

    Ast.DestructStep matchLeft;
    Ast.Transform matchRight;
    Stack<Ast.DestructStep> destructStepStack = new Stack<>();

    @Override
    public void enterRuleStatement(DestructParser.RuleStatementContext ctx) {
//        System.out.println("rule " + getText(ctx));
        ruleMatches = new ArrayList<>();
    }
    @Override
    public void exitRuleStatement(DestructParser.RuleStatementContext ctx) {
        Ast.Rule rule = new Ast.Rule(getText(ctx.ruleTarget()), ruleMatches);
        rules.add(rule);
        this.rule = null;
    }

    @Override
    public void enterMatch(DestructParser.MatchContext ctx) {
        this.matchLeft = new Ast.DestructStep("top", new ArrayList<>());
        this.matchRight = new Ast.Transform(new ArrayList<>());
        this.destructStepStack.push(this.matchLeft);
    }

    @Override
    public void exitMatch(DestructParser.MatchContext ctx) {
        this.ruleMatches.add(new Ast.Match(this.matchLeft, new Ast.Transform(new ArrayList<>())));
        this.matchLeft = null;
        this.matchRight = null;
        this.destructStepStack.pop();
    }

    @Override
    public void exitDestruct(DestructParser.DestructContext ctx) {
        var restNode = ctx.destructRest();
        if (restNode != null && restNode.key() != null) {
            String key = getText(restNode.key());
            Ast.DestructStep step = new Ast.DestructStep("rest " + key, new ArrayList<>());
            this.matchLeft.steps().add(step);
        }
    }

    private Ast.Rest getRest(DestructParser.DestructRestContext restNode) {
        return new Ast.Rest(restNode.key() == null ?
                Optional.empty() :
                Optional.of(getText(restNode.key())));
    }

    @Override
    public void enterDestructPair(DestructParser.DestructPairContext ctx) {
        Ast.DestructStep parentStep = this.destructStepStack.peek();
        Ast.DestructStep newStep = new Ast.DestructStep("pair", new ArrayList<>());
        // Could push to destructStepStack here and pop in exist, but seeing if linear is enough
        parentStep.steps().add(newStep);
    }

    @Override
    public void exitDestructPair(DestructParser.DestructPairContext ctx) {
        Ast.DestructStep step = this.destructStepStack.peek();
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
            } else if (isValObject || isValArray){
                msg += "destruct to '" + getText(ctx.destructValue()) + "'";
            } else {
                msg += "match '" + getText(ctx.destructValue()) + "'";
            }
        }
        step.steps().add(new Ast.DestructStep(msg, new ArrayList<>()));
    }

    public void setParser(DestructParser parser) {

        this.parser = parser;
    }
}
package ai.mender;

import java.util.HashMap;
import java.util.Map;

public class Example {
    // This file is a sketch of what the ending code will look like.
    public static void main(String[] args) {
        /*
        Rule[target=start, match=[
        Match[left=
                DestructStep[msg=top, steps=[
        DestructStep[msg=pair, steps=[
        DestructStep[msg=take key 'statement' store to 'statement' , steps=[]]]],
        DestructStep[msg=pair, steps=[
        DestructStep[msg=take key 'moreStatements' match 'null', steps=[]]]]]], right=Transformed[]],
        Match[left=
                DestructStep[msg=top, steps=[
        DestructStep[msg=pair, steps=[
        DestructStep[msg=take key 'statement' store to 'statement' , steps=[]]]],
        DestructStep[msg=pair, steps=[
        DestructStep[msg=take key 'moreStatements' store to 'moreStatements' , steps=[]]]]]], right=Transformed[]]]]]

         */
        Map<String, Object> left = new HashMap<>();
        Map<String, Object> right = new HashMap<>();
        rule1(left, right);

    }

    private static void rule1(Map<String, Object> left, Map<String, Object> right) {
        if (match1(left, right)) {
            return;
        }
        if (match2(left, right)) {
            return;
        }
        throw new RuntimeException("No rules matched!");
    }
    private static boolean match1(Map<String, Object> left, Map<String, Object> right) {
        if (!left.containsKey("statement")) {
            return false;
        }
        Object statement = left.get("statement");
        if (left.containsKey("moreStatements")) { // TODO: pass undefined
            return false;
        }
        return true;
    }

    private static boolean match2(Map<String, Object> left, Map<String, Object> right) {
        if (!left.containsKey("statement")) {
            return false;
        }
        Object statement = left.get("statement");
        if (left.containsKey("moreStatements")) { // TODO: pass undefined
            return false;
        }
        return true;
    }
}

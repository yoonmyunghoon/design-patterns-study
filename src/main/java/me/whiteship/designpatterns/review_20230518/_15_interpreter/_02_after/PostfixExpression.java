package me.whiteship.designpatterns.review_20230518._15_interpreter._02_after;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> context);
}

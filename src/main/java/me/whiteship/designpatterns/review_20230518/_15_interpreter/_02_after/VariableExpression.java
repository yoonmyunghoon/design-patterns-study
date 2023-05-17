package me.whiteship.designpatterns.review_20230518._15_interpreter._02_after;

import java.util.Map;

public class VariableExpression implements PostfixExpression {

    private final Character character;

    public VariableExpression(Character character) {
        this.character = character;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(character);
    }
}

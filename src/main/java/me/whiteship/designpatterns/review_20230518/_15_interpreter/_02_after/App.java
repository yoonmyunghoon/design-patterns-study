package me.whiteship.designpatterns.review_20230518._15_interpreter._02_after;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        PostfixParser postfixParser = new PostfixParser();
        PostfixExpression expression = postfixParser.parser("xyz+-a+");
        System.out.println(expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3, 'a', 4)));
    }
}

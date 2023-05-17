package me.whiteship.designpatterns.review_20230518._15_interpreter._02_after;

import java.util.Stack;

public class PostfixParser {

    public PostfixExpression parser(String characters) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : characters.toCharArray()) {
            stack.push(getExpression(c, stack));
        }
        return stack.pop();
    }

    private PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+':
                return new PlusExpression(stack.pop(), stack.pop());
            case '-':
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return new MinusExpression(left, right);
            default:
                return new VariableExpression(c);
        }
    }


}

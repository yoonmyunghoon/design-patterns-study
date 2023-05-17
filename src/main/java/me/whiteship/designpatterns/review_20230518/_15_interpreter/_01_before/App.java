package me.whiteship.designpatterns.review_20230518._15_interpreter._01_before;

public class App {
    public static void main(String[] args) {
        PostfixNotation postfixNotation = new PostfixNotation("123+-");
        postfixNotation.calculate();
    }
}

package me.whiteship.designpatterns.review_20230518._14_command._01_before;

public class App {
    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
        button.press();
    }
}

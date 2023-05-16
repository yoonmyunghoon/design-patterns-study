package me.whiteship.designpatterns._03_behavioral_patterns._14_command._01_before;

// invoker
public class MyApp {

    private Game game;

    public MyApp(Game game) {
        this.game = game;
    }

    public void press() {
        game.end();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new Game());
        myApp.press();
        myApp.press();
        myApp.press();
        myApp.press();
    }
}

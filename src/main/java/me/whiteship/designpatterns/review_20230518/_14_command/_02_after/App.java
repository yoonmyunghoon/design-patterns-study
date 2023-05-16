package me.whiteship.designpatterns.review_20230518._14_command._02_after;

public class App {
    public static void main(String[] args) {
        Light light = new Light();
        Button buttonForOn = new Button(new LightOnCommand(light));
        Button buttonForOff = new Button(new LightOffCommand(light));
        buttonForOn.press();
        buttonForOff.press();
        buttonForOn.press();
        buttonForOff.press();
    }
}

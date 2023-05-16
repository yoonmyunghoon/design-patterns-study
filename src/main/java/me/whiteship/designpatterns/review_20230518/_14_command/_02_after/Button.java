package me.whiteship.designpatterns.review_20230518._14_command._02_after;

// invoker
public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

}

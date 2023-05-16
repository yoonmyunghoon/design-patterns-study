package me.whiteship.designpatterns.review_20230518._14_command._01_before;

// invoker
public class Button {

    private Light light;

    public Button(Light light) {
        this.light = light;
    }

    public void press() {
        if (light.isOn()) {
            light.off();
        } else {
            light.on();
        }
    }

}

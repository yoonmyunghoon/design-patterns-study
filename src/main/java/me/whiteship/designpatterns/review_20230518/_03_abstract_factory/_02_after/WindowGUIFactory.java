package me.whiteship.designpatterns.review_20230518._03_abstract_factory._02_after;

public class WindowGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }
}

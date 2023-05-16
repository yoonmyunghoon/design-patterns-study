package me.whiteship.designpatterns.review_20230518._03_abstract_factory._02_after;

public class DrawProgram {
    GUIFactory guiFactory;
    Button button;
    Checkbox checkbox;

    public DrawProgram(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    public void createUI() {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public void drawUI() {
        button.print();
        checkbox.print();
    }
}

package me.whiteship.designpatterns.review_20230518._03_abstract_factory._01_before;

public class DrawProgram {
    WindowButton button;
    WindowCheckbox checkbox;

    public void createUI() {
        this.button = new WindowButton();
        this.checkbox = new WindowCheckbox();
    }

    public void drawUI() {
        button.print();
        checkbox.print();
    }
}

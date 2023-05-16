package me.whiteship.designpatterns.review_20230518._03_abstract_factory._02_after;

public class App {
    public static void main(String[] args) {
        GUIFactory guiFactory = new WindowGUIFactory();

        DrawProgram drawProgram = new DrawProgram(guiFactory);
        drawProgram.createUI();
        drawProgram.drawUI();

    }
}

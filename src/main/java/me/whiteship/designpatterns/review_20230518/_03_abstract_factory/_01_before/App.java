package me.whiteship.designpatterns.review_20230518._03_abstract_factory._01_before;

public class App {
    public static void main(String[] args) {
        DrawProgram drawProgram = new DrawProgram();
        drawProgram.createUI();
        drawProgram.drawUI();
    }
}

package me.whiteship.designpatterns.review_20230518._07_bridge._01_before;

public class SquareWithRed extends Square {
    @Override
    void draw() {
        super.draw();
        System.out.println("with");
        new Red().applyColor();
    }
}

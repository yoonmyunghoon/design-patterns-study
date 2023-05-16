package me.whiteship.designpatterns.review_20230518._07_bridge._02_after;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing a square");
        System.out.println("with");
        color.applyColor();
    }
}

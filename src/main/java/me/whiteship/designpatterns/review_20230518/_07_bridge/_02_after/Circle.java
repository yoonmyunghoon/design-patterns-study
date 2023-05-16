package me.whiteship.designpatterns.review_20230518._07_bridge._02_after;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle");
        System.out.println("with");
        color.applyColor();
    }
}

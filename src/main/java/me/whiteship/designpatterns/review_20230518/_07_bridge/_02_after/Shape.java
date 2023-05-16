package me.whiteship.designpatterns.review_20230518._07_bridge._02_after;

public abstract class Shape {
    Color color;
    public Shape(Color color) {
        this.color = color;
    }
    abstract void draw();
}

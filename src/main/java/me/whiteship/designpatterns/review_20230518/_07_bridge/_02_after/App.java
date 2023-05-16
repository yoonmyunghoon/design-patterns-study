package me.whiteship.designpatterns.review_20230518._07_bridge._02_after;

public class App {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.draw();
//        Square square = new Square();
//        square.draw();
//
//        Blue blue = new Blue();
//        blue.applyColor();
//        Red red = new Red();
//        red.applyColor();

        Circle circle = new Circle(new Blue());
        circle.draw();
        Square square = new Square(new Red());
        square.draw();
        Square squareWithGreen = new Square(new Green());
        squareWithGreen.draw();

    }
}

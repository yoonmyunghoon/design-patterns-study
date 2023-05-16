package me.whiteship.designpatterns.review_20230518._07_bridge._01_before;

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

        CircleWithBlue circleWithBlue = new CircleWithBlue();
        circleWithBlue.draw();
        SquareWithRed squareWithRed = new SquareWithRed();
        squareWithRed.draw();

    }
}

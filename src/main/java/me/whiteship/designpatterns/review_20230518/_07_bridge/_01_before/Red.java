package me.whiteship.designpatterns.review_20230518._07_bridge._01_before;

public class Red extends Color {
    @Override
    void applyColor() {
        System.out.println("Applying red color");
    }
}
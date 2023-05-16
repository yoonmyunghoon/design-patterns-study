package me.whiteship.designpatterns.review_20230518._10_facade._01_before;

public class App {
    public static void main(String[] args) {
        SubSystemA subSystemA = new SubSystemA();
        SubSystemB subSystemB = new SubSystemB();
        SubSystemC subSystemC = new SubSystemC();

        subSystemA.operationA();
        subSystemB.operationB();
        subSystemC.operationC();
    }
}

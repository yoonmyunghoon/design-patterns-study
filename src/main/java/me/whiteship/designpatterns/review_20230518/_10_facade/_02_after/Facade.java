package me.whiteship.designpatterns.review_20230518._10_facade._02_after;

public class Facade {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;

    public Facade() {
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
        subSystemC = new SubSystemC();
    }

    public void operation() {
        subSystemA.operationA();
        subSystemB.operationB();
        subSystemC.operationC();
    }
}

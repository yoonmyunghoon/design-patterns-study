package me.whiteship.designpatterns.review_20230518._01_singleton._02_after;

/**
 * synchronized 블록 사용
 */
public class Singleton02 {
    private static Singleton02 instance;
    private Singleton02() {}
    public static synchronized Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }
}

package me.whiteship.designpatterns.review_20230518._01_singleton._02_after;
/**
 * 기본 싱글톤
 */
public class Singleton01 {
    private static Singleton01 instance;

    private Singleton01() {}

    public static Singleton01 getInstance() {
        if (instance == null) {
            instance = new Singleton01();
        }
        return instance;
    }
}

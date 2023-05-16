package me.whiteship.designpatterns.review_20230518._01_singleton._02_after;

/**
 * 이른 초기화
 */
public class Singleton03 {
    private static final Singleton03 INSTANCE = new Singleton03();
    private Singleton03() {}

    public static Singleton03 getInstance() {
        return INSTANCE;
    }
}

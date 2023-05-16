package me.whiteship.designpatterns.review_20230518._01_singleton._02_after;

/**
 * 더블 체크드 락킹
 */
public class Singleton04 {
    private static volatile Singleton04 instance;
    private Singleton04() {}
    public static Singleton04 getInstance() {
        if (instance == null) {
            synchronized (Singleton04.class) {
                if (instance == null) {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }
}

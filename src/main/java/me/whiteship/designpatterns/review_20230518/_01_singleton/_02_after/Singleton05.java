package me.whiteship.designpatterns.review_20230518._01_singleton._02_after;

public class Singleton05 {
    private Singleton05() {}
    private static class Singleton05Holder {
        private static final Singleton05 INSTANCE = new Singleton05();
    }
    public static Singleton05 getInstance() {
        return Singleton05Holder.INSTANCE;
    }
}

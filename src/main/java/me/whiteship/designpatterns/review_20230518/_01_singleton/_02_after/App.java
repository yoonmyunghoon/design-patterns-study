package me.whiteship.designpatterns.review_20230518._01_singleton._02_after;

public class App {
    public static void main(String[] args) {

//        Singleton01 a = Singleton01.getInstance();
//        Singleton01 b = Singleton01.getInstance();

//        Singleton02 a = Singleton02.getInstance();
//        Singleton02 b = Singleton02.getInstance();

//        Singleton03 a = Singleton03.getInstance();
//        Singleton03 b = Singleton03.getInstance();

//        Singleton04 a = Singleton04.getInstance();
//        Singleton04 b = Singleton04.getInstance();

//        Singleton05 a = Singleton05.getInstance();
//        Singleton05 b = Singleton05.getInstance();

        Singleton06 a = Singleton06.INSTANCE;
        Singleton06 b = Singleton06.INSTANCE;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);
        System.out.println(a.equals(b));

    }
}

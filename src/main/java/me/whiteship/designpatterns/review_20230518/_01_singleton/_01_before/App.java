package me.whiteship.designpatterns.review_20230518._01_singleton._01_before;

public class App {
    public static void main(String[] args) {

        NonSingleton a = new NonSingleton();
        NonSingleton b = new NonSingleton();

        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}

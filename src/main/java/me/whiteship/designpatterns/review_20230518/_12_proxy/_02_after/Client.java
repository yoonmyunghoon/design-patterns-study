package me.whiteship.designpatterns.review_20230518._12_proxy._02_after;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameService proxy = new GameServiceProxy();
        proxy.startGame();
        proxy.startGame();
        proxy.startGame();
    }
}

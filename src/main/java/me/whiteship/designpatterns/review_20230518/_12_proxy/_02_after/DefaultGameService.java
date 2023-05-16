package me.whiteship.designpatterns.review_20230518._12_proxy._02_after;

public class DefaultGameService implements GameService{

    public DefaultGameService() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void startGame() {
        System.out.println("이 자리에 오신 여러분을 진심으로 환영합니다.");
    }

}

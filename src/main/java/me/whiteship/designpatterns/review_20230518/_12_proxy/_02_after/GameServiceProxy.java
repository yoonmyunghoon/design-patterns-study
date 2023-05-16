package me.whiteship.designpatterns.review_20230518._12_proxy._02_after;

public class GameServiceProxy implements GameService {
    private GameService gameService;

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        // 지연로딩
        if (gameService == null) {
            gameService = new DefaultGameService();
        }
        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);

    }
}

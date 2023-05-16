package me.whiteship.designpatterns.review_20230518._13_chain_of_responsibilities._02_after;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new AuthRequestHandler(new LoggingRequestHandler(new DefaultRequestHandler(null)));
        requestHandler.handler(request);
    }
}

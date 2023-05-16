package me.whiteship.designpatterns.review_20230518._13_chain_of_responsibilities._02_after;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println("로깅");
        super.handler(request);
    }
}

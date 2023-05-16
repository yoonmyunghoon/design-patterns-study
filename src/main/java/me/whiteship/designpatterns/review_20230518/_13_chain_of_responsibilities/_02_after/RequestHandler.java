package me.whiteship.designpatterns.review_20230518._13_chain_of_responsibilities._02_after;

public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handler(Request request) {
        if (nextHandler != null) {
            nextHandler.handler(request);
        }
    }
}

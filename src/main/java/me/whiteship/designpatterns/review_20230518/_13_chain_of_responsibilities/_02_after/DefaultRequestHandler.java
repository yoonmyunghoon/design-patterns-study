package me.whiteship.designpatterns.review_20230518._13_chain_of_responsibilities._02_after;

public class DefaultRequestHandler extends RequestHandler {

    public DefaultRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println(request.getBody());
        super.handler(request);
    }
}

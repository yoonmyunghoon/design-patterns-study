package me.whiteship.designpatterns.review_20230518._09_decorator._02_after;

public class App {

    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();
        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentService(commentService);
        }
        if (enabledTrimming) {
            commentService = new TrimmingCommentService(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }
}

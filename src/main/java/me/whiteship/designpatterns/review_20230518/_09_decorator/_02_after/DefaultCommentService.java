package me.whiteship.designpatterns.review_20230518._09_decorator._02_after;

public class DefaultCommentService implements CommentService {
    public void addComment(String comment) {
        System.out.println(comment);
    }
}

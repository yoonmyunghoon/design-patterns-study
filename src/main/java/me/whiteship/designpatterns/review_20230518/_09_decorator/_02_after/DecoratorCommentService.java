package me.whiteship.designpatterns.review_20230518._09_decorator._02_after;

public class DecoratorCommentService implements CommentService {
    CommentService commentService;

    public DecoratorCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}

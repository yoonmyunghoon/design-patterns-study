package me.whiteship.designpatterns.review_20230518._16_iterator._02_after;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {
    private Iterator<Post> postIterator;

    public RecentPostIterator(List<Post> posts) {
        posts.sort((p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        this.postIterator = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return postIterator.hasNext();
    }

    @Override
    public Post next() {
        return postIterator.next();
    }
}

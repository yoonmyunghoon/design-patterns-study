package me.whiteship.designpatterns.review_20230518._06_adapter_marking._02_after;

import java.util.List;

public class B_SortEngineAdapter implements ISortEngine {
    private B_SortEngine engine;

    public B_SortEngineAdapter(B_SortEngine engine) {
        this.engine = engine;
    }

    @Override
    public void setList(List<String> items) {
        engine.setList(items);
    }

    @Override
    public void sort() {
        engine.sorting(false);
    }

    @Override
    public void reverseSort() {
        engine.sorting(true);
    }

    @Override
    public void printSortListPretty() {
        engine.printPretty();
    }
}

package me.whiteship.designpatterns.review_20230518_ex._02_after;

import java.util.List;

public class SortingMachine {
    ISortEngine engine;

    public void setEngine(ISortEngine engine) {
        this.engine = engine;
    }

    public void run(List<String> items) {
        engine.setList(items);

        engine.sort();
        engine.printSortListPretty();

        engine.reverseSort();
        engine.printSortListPretty();
    }

}

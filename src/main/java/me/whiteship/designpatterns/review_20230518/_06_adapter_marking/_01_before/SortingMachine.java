package me.whiteship.designpatterns.review_20230518._06_adapter_marking._01_before;

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

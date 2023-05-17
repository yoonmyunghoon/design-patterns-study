package me.whiteship.designpatterns.review_20230518._06_adapter_marking._02_after;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        SortingMachine machine = new SortingMachine();
//        machine.setEngine(new A_SortEngine());
        machine.setEngine(new NewSortEngineAdapter(new NewSortEngine()));

        List<String> items = new ArrayList<>();
        items.add("CCC");
        items.add("ABB");
        items.add("ABA");
        items.add("CAE");

        machine.run(items);
    }
}

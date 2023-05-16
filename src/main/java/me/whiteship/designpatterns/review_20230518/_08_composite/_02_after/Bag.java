package me.whiteship.designpatterns.review_20230518._08_composite._02_after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {

    private List<Component> components = new ArrayList<>();

    public void addItem(Item item) {
        components.add(item);
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}

package me.whiteship.designpatterns.review_20230518._08_composite._02_after;

public class Item implements Component {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

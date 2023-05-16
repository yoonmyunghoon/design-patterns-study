package me.whiteship.designpatterns.review_20230518._08_composite._02_after;

public class App {
    public static void main(String[] args) {
        Item a = new Item("a", 1000);
        Item b = new Item("b", 2000);

        Bag bag = new Bag();
        bag.addItem(a);
        bag.addItem(b);

        printPrice(a);
        printPrice(bag);

    }

    public static void printPrice(Component component) {
        System.out.println(component.getPrice());
    }


}

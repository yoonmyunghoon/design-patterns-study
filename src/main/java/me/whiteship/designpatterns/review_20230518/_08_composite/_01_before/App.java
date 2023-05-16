package me.whiteship.designpatterns.review_20230518._08_composite._01_before;

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

    public static void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    public static void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);
    }

}

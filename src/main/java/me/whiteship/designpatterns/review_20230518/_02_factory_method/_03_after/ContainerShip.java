package me.whiteship.designpatterns.review_20230518._02_factory_method._03_after;

public class ContainerShip extends Ship {
    public ContainerShip(String name, String color, String capacity) {
        setName(name);
        setColor(color);
        setCapacity(capacity);
    }
}

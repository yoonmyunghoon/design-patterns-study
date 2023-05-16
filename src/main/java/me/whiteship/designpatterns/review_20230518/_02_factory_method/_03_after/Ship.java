package me.whiteship.designpatterns.review_20230518._02_factory_method._03_after;

public class Ship {
    private String name;
    private String color;
    private String capacity;

    @Override
    public String toString() {
        return String.format("Ship { name: '%s', color: '%s', capacity: '%s' }", name, color, capacity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}

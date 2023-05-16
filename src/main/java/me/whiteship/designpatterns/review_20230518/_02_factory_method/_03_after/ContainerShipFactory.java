package me.whiteship.designpatterns.review_20230518._02_factory_method._03_after;

public class ContainerShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new ContainerShip("ContainerShip", "20t", "green");
    }
}

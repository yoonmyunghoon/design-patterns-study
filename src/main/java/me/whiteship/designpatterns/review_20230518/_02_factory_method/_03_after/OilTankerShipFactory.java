package me.whiteship.designpatterns.review_20230518._02_factory_method._03_after;

public class OilTankerShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new OilTankerShip("OilTankerShip", "15t", "blue");
    }
}

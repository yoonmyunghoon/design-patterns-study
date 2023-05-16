package me.whiteship.designpatterns.review_20230518._02_factory_method._03_after;

public class App {
    public static void main(String[] args) {

        Ship containerShip = new ContainerShipFactory().orderShip("ContainerShip", "reynold.kakao.com");
        System.out.println(containerShip);

        Ship oilTankerShip = new OilTankerShipFactory().orderShip("OilTankerShip", "reynold.kakao.com");
        System.out.println(oilTankerShip);


    }
}

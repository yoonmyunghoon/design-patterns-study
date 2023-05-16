package me.whiteship.designpatterns.review_20230518._02_factory_method._01_before;

public class App {
    public static void main(String[] args) {
        Ship containerShip = Ship.orderShip("ContainerShip", "reynold.kakao.com");
        System.out.println(containerShip);

        Ship oilTankerShip = Ship.orderShip("OilTankerShip", "reynold.kakao.com");
        System.out.println(oilTankerShip);
    }
}

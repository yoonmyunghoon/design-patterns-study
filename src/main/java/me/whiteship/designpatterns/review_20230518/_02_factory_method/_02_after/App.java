package me.whiteship.designpatterns.review_20230518._02_factory_method._02_after;

/**
 * simple factory method 사용
 * 선박 종류가 추가될 때마다 분기 처리는 계속 해줘야함
 */
public class App {
    public static void main(String[] args) {

        ShipFactory shipFactory = new ShipFactory();

        Ship containerShip = shipFactory.orderShip("ContainerShip", "reynold.kakao.com");
        System.out.println(containerShip);

        Ship oilTankerShip = shipFactory.orderShip("OilTankerShip", "reynold.kakao.com");
        System.out.println(oilTankerShip);
    }
}

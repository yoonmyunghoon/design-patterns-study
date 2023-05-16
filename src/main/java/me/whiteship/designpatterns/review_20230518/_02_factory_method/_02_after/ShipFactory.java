package me.whiteship.designpatterns.review_20230518._02_factory_method._02_after;

public class ShipFactory {

    public Ship orderShip(String name, String email) {
        // validation 체크
        validate(name, email);

        // 선박 객체 생성
        Ship ship = createShip(name);

        // 알림 보내기
        notify(email, ship);

        return ship;
    }

    private void notify(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었다고 " + email + "로 메일을 보냈습니다.");
    }

    private Ship createShip(String name) {
        Ship ship = null;
        if (name.equalsIgnoreCase("ContainerShip")) {
            ship = new ContainerShip();
        } else if (name.equalsIgnoreCase("OilTankerShip")) {
            ship = new OilTankerShip();
        }
        return ship;
    }

    private void validate(String name, String email) {
        if (name == null) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }
        if (email == null) {
            throw new IllegalArgumentException("이메일을 남겨주세요");
        }
    }

}

package me.whiteship.designpatterns.review_20230518._02_factory_method._03_after;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        Ship ship = createShip();
        notify(email, ship);
        return ship;
    }

    Ship createShip();

    private void notify(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었다고 " + email + "로 메일을 보냈습니다.");
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

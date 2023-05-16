package me.whiteship.designpatterns.review_20230518._02_factory_method._01_before;

public class Ship {
    private String name;
    private String color;
    private String capacity;

    @Override
    public String toString() {
        return String.format("Ship { name: '%s', color: '%s', capacity: '%s' }", name, color, capacity);
    }

    public static Ship orderShip(String name, String email) {
        // validation 체크
        if (name == null) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }
        if (email == null) {
            throw new IllegalArgumentException("이메일을 남겨주세요");
        }

        // 선박 객체 생성
        Ship ship = new Ship();

        // 후 처리
        ship.name = name;

        if (name.equalsIgnoreCase("ContainerShip")) {
            ship.capacity = "20t";
        } else if (name.equalsIgnoreCase("OilTankerShip")) {
            ship.capacity = "15t";
        }

        if (name.equalsIgnoreCase("ContainerShip")) {
            ship.color = "green";
        } else if (name.equalsIgnoreCase("OilTankerShip")) {
            ship.color = "blue";
        }

        // 알림 보내기
        System.out.println(ship.name + " 다 만들었다고 " + email + "로 메일을 보냈습니다.");

        return ship;
    }
}

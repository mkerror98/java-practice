package ch6_oop1;

class Car {
    String color;
    String gearType;
    int door;

    Car() {}

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
        // 매개변수를 갖는 생성자는 생성과 초기화를 동시에 할 수 있어 코드가 간결해진다.
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color        = "white";
        c1.gearType        = "auto";
        c1.door         = 4;

        Car c2 = new Car("white", "auto", 4);

        System.out.println("c1의 color = " + c1.color + ", c1의 geartype = " + c1.gearType + ", c1의 door = " + c1.door );
        System.out.println("c2의 color = " + c2.color + ", c2의 geartype = " + c2.gearType + ", c2의 door = " + c2.door );
    }
}

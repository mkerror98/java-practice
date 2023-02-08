package ch6_oop1;

class Car_1{
    String color;
    String gearType;
    int door;

    Car_1() {
        this("white", "auto", 4);
    }

    Car_1(String color) {
        this(color, "auto", 4);
    }
    Car_1(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Car_1 c1 = new Car_1("wow", "manual", 6);
        Car_1 c2 = new Car_1("blue");

        System.out.println("c1의 color = " + c1.color + ", c1의 geartype = " + c1.gearType + ", c1의 door = " + c1.door );
        System.out.println("c2의 color = " + c2.color + ", c2의 geartype = " + c2.gearType + ", c2의 door = " + c2.door );

    }
}

package ch6_oop1;

class Car_ {
    String color;
    String gearType;
    int door;

    Car_() {
        this("white", "auto", 4);
    }

    Car_(Car_ c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car_(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class CarTest3 {
    public static void main(String[] args) {
        Car_ c1 = new Car_();
        Car_ c2 = new Car_(c1);

        System.out.println("c1의 color = " + c1.color + ", c1의 geartype = " + c1.gearType + ", c1의 door = " + c1.door );
        System.out.println("c2의 color = " + c2.color + ", c2의 geartype = " + c2.gearType + ", c2의 door = " + c2.door );

        c1.door = 100;
        System.out.println("c1.door = 100; 을 실행한 후.");
        System.out.println("c1의 color = " + c1.color + ", c1의 geartype = " + c1.gearType + ", c1의 door = " + c1.door );
        System.out.println("c2의 color = " + c2.color + ", c2의 geartype = " + c2.gearType + ", c2의 door = " + c2.door );
    }
}
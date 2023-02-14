package ch7_oop2;

public class PointTest {
    public static void main(String[] args) {
        My_Point3D p3 = new My_Point3D(1,2,3);
        System.out.println(p3.x);
        System.out.println(p3.y);
        System.out.println(p3.z);
    }
}

class My_Point {
    int x, y;

    My_Point() {}

    My_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x :" + x + ", y :" + y;
    }
}

class My_Point3D extends My_Point {
    int z;

    My_Point3D(int x, int y, int z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }
    String getLocation() {
        return "x :" + x + ", y :" + y + ", z :" + z;
    }
}

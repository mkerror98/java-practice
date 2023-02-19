package ch7_oop2;

class InstanceOfTest {
    public static void main(String[] args) {
        FireEngine2 fe = new FireEngine2();

        if(fe instanceof FireEngine2) {
            System.out.println("This is a FireEngine instance.");
        }

        if(fe instanceof Car1) {
            System.out.println("This is a Car instance.");
        }

        if(fe instanceof Object) {
            System.out.println("This is a Object instance.");
        }

        System.out.println(fe.getClass().getName());
    }
}

class Car1 {}
class FireEngine2 extends Car1{}

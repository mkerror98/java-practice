package ch6_oop1;

public class MyMathTest {
    public static void main (String[] args) {
        MyMath mm = new MyMath();

        long result1  = mm.add        (5L, 3L);
        long result2  = mm.substract  (5L, 3L);
        long result3 = mm.multiply    (5L, 3L );
        double result4 = mm.devide    (5L, 3L );    // double대신 long값으로 호출하였다. 이 값은 double로 자동형변환된다.

        System.out.println("add(5L,3L) = " + result1);
        System.out.println("substract(5L,3L) = " + result2);
        System.out.println("multiply(5L,3L) = " + result3);
        System.out.println("devide(5L,3L) = " + result4);
    }
}


class MyMath {
    long add        (long a, long b)     {return a+b;}
    long substract  (long a, long b)     {return a-b;}
    long multiply   (long a, long b)     {return a*b;}
    double devide   (double a, double b) {return a/b;}
}
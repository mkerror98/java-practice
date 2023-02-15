package ch7_oop2;

class Card_2 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card_2(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    Card_2() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        Card_2 c = new Card_2("HEART", 10);
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}

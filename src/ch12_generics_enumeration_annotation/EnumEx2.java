package ch12_generics_enumeration_annotation;

enum Direction1 {
    EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

    private static final Direction1[] DIR_APR = Direction1.values();
    private final int value;
    private final String symbol;

    Direction1(int value, String symbol) {   // 접근 제어자 private이 생략됨
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue()        { return value;}
    public String getSymbol()    { return symbol;}

    public static Direction1 of(int dir) {
        if(dir < 1 || dir > 4) {  // EAST~NORTH의 값이 1~4이기 때문.
            throw new IllegalArgumentException("Invalid value :" + dir);
        }
        return DIR_APR[dir -1];
    }

    // 방향을 회전시키는 메서드. num의 값만큼 90도씩 시계방향으로 회전한다.
    public Direction1 rotate(int num) {
        num = num % 4;

        if(num < 0) num += 4;   // num이 음수일 때는 시계반대 방향으로 회전

        return DIR_APR[(value-1+num) % 4];
    }

    public String toString() {
        return name()+getSymbol();
    }
}
public class EnumEx2 {
    public static void main(String[] args) {
        for(Direction1 d : Direction1.values())
            System.out.printf("%s=%d\n", d.name(), d.getValue());

        Direction1 d1 = Direction1.EAST;
        Direction1 d2 = Direction1.of(2);

        System.out.printf("d1=%s, %d\n", d1.name(), d1.getValue());
        System.out.printf("d2=%s, %d\n", d2.name(), d2.getValue());

        System.out.println(Direction1.EAST.rotate(1));
        System.out.println(Direction1.EAST.rotate(2));
        System.out.println(Direction1.EAST.rotate(-1));
        System.out.println(Direction1.EAST.rotate(-2));
    }
}

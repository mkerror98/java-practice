package ch6_oop1;

class Tv3 {
    // Tv의 속성(멤버변수)
    String color;       // 색상
    boolean power;       // 전원상태
    int channel;        // 채널

    // Tv의 기능(메서드)
    void power()         {power=!power;}     // Tv의 전원을 켜거나 끄는 기능을 하는 메서드.
    void channelUp()     {++channel;}        // Tv의 채널을 높이는 기능을 하는 메서드.
    void channelDown()   {--channel;}        // Tv의 채널을 낮추는 기능을 하는 메서드.
}

public class TvTest3 {
    public static void main(String[] args) {
        Tv3 t1 = new Tv3();
        Tv3 t2 = new Tv3();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t2 = t1;         // t1이 저장하고 있는 값(주소)를 t2에 저장한다.
        t1.channel = 7;  // t1.channel 값을 7로 한다.
        System.out.println("t1의 channel값을 7로 변경하였습니다.");
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");

        // t1이 저장하고 있는 주소를 t2에 저장하면서, t2 역시 t1이 참조하고 있던 인스턴스를 같이 참조하게 되므로
        // t1.channel과 t2.channel의 값이 같아진다.
    }
}

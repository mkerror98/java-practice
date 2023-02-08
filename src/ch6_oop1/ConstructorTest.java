package ch6_oop1;

class Data_1 {
    int value;
}

class Data_2 {
    int value;

    Data_2(int x) {      // 매개변수가 있는 생성자.
        value = x;
    }
}
public class ConstructorTest {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
      //Data_2 d2 = new Data_2();  // 에러.
        // Data_1의 인스턴스를 생성하는 코드는 에러가 없다. Data_1에는 정의되어 있는 생성자가 하나도 없으므로 컴파일러가 기본 생성자를 자동 추가해줌.
        // Data_2에는 정의되어있는 생성자가 있으므로 기본 생성자가 추가되지 않았기 때문이다.
        // 컴파일러가 자동적으로 기본 생성자를 추가해주는 경우는 '클래스 내에 생성자가 하나도 없을 때'뿐이다.
    }
}

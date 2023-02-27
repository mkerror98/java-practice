package ch7_oop2;

public class ExceptionEx11 {
    public static void main(String[] args) {

        throw new RuntimeException();    // RuntimeException 을 고의로 발생시킨다.
        // 예외처리를 하지 않아도 컴파일이 되고 실행하면 RuntimeException 이 발생하여 비정상 종료된다.
        // RuntimeException 클래스와 그 자손에 해당하는 예외는 프로그래머에 의해 실수로 발생하는 것들이기 때문에 예외처리를 강제하지 않기 때문이다.

    }
}

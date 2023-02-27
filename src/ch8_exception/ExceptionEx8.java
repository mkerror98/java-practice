package ch8_exception;

public class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);    // 예외발생 !
            System.out.println(4);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();   // 참조변수 ae를 통해, 생성된 ArithmeticException 인스턴스에 접근할 수 있다.
            System.out.println("예외메시지 : " + ae.getMessage());
        }
        System.out.println(6);
    }
}

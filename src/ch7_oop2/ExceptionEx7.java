package ch7_oop2;

public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if(ae instanceof Exception)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception"); // 위 catch문에서 예외처리를 했기 때문에 이 라인은 실행되지 않음.
        } // try-catch 문의 끝.
        System.out.println(6);
    }
}

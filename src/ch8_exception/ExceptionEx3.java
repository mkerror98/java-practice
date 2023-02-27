package ch8_exception;

public class ExceptionEx3 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for(int i=0; i<10; i++) {
            try {
                result = number/(int)(Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException ae) {
                System.out.println("0");    // 나누는 숫자가 0이라면 ArithmeticException이 발생하므로, 0이 출력되도록 예외처리 하였음.
            } // try-catch의 끝
        } // for문의 끝.
    }
}

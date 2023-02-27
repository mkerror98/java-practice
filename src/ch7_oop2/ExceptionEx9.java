package ch7_oop2;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음.");  // 생성자에 String 을 넣어주면, 이 String이 Exception 인스턴스에 메시지로 저장됨.
            throw e;  // 예외를 발생시킴.
         // throw new Exception("고의로 발생시켰음.");  위에 두 줄을 한 줄로 줄여 쓸 수 이씅ㅁ.

        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }
}

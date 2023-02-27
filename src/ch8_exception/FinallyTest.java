package ch8_exception;

public class FinallyTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
            deleteTempFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();   // 프로그램 설치 과정 중 예외가 발생하더라도, 설치에 사용된 임시파일들이 삭제되도록 함.
        }
    }

        static void startInstall() {
            /* 프로그램 설치에 필요한 준비를 하는 코드 */
        }
        static void copyFiles() {}
        static void deleteTempFiles() {}
    }

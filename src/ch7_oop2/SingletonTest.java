package ch7_oop2;

final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(s==null)
            s = new Singleton();

        return s;
    }
}

class SingletonTest {
    public static void main(String[] args) {
       // Singleton s = new Singleton();  에러 ! 생성자 Singleton()의 제어자가 private 이기 때문에 다른 클래스에서 인스턴스 생성 불가능.
        Singleton s = Singleton.getInstance();
    }
}
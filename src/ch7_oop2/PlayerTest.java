package ch7_oop2;

abstract class Player {
    abstract void play(int pos);
    abstract void stop();
}

class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos + "부터 재생합니다.");
    }
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }

    void reload() {
        System.out.println("처음부터 다시 시작합니다.");}
}

public class PlayerTest {
    public static void main(String[] args) {
        Player ap = new AudioPlayer();
        ap.play(100);
        ap.stop();

    }
}

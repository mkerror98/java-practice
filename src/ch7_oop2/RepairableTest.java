package ch7_oop2;

class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();   // Tank클래스의 객체 생성
        Dropship dropship = new Dropship();  // Dropship 클래스의 객체 생성

        Marine marine = new Marine();  // Marine클래스의 객체 생성
        SCV scv = new SCV();

        scv.repair(tank);  // repair(Repairable r)메서드의 매개변수가 인터페이스이므로 해당 인터페이스를 구현한 클래스의 객체를 넣어주어야 함.
        scv.repair(dropship); // dropship을 수리. dropship의 MAX_HP와 hipPoint가 다르다면 hipPoint를 증가시켜줌.
      //scv.repair(marine);  // 에러!, Marine클래스는 Repairable인터페이스를 구현하지 않았기 때문에 repair(Repairable r)메서드를 사용할 수 없음.

    }
}

interface Repairable {}

class Unit {
    int hitPoint;
    final int MAX_HP;   // 최대 체력
    Unit(int hp) {      // MAX_HP 값을 설정하기 위한 생성자.
        MAX_HP = hp;
    }
    //...
}

class GroundUnit extends Unit {   // Unit클래스를 상속받음
    GroundUnit(int hp) {
        super(hp);  // Unit(int hp) 호출.
    }
}

class AirUnit extends Unit {   // Unit클래스를 상속받음
    AirUnit(int hp) {
        super(hp);  // Unit(int hp) 호출.
    }
}

class Tank extends GroundUnit implements Repairable {    // GroundUnit클래스 상속받고, Repairable인터페이스를 구현
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Tank";
    }
    //...
}

class Dropship extends AirUnit implements Repairable {    // AirUnit클래스를 상속받고, Repairable 인터페이스를 구현
    Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Dropship";
    }
    //...
}

class Marine extends GroundUnit {  // GroundUnit클래스를 상속받음.
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
    //...
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) { //  인터페이스 Repairable를 구현한 클래스의 인스턴스를 받는 매개변수.
        if(r instanceof Unit) {  // r이 Unit 타입으로 형변환이 가능한지 확인.
            Unit u = (Unit)r;    // 가능하다면 r을 Unit타입으로 형변환하여 u에 저장.
            while(u.hitPoint!=u.MAX_HP) {  // 유닛의 hipPoint가 최대 체력과 다르다면(체력이 깎였다면)
                /* Unit의 HP를 증가시킨다. */
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
    //...
}












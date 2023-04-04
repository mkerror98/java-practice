package ch12_generics_enumeration_annotation;
import java.util.ArrayList;

class Fruit2 implements Eatable {  // Eatable 인터페이스를 구현함.
    public String toString() {return "Fruit";}
}
class Apple2 extends Fruit2 { public String toString() { return "Apple";}}
class Grape2 extends Fruit2 { public String toString() { return "Grape";}}
class Toy2                  { public String toString() { return "Toy"  ;}}
interface Eatable {}


class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit2> fruitBox = new FruitBox<Fruit2>();
        FruitBox<Apple2> appleBox = new FruitBox<Apple2>();
        FruitBox<Grape2> grapeBox = new FruitBox<Grape2>();
      //FruitBox<Grape2> grapeBox = new FruitBox<Apple2>(); // 에러. 타입 불일치
      //FruitBox<Toy2>   ToyBox   = new FruitBox<Toy2>();   // 에러. 클래스 Toy2는 Fruit2의 자손도, 인터페이스 Eatable을 구현하지도 않았음.

        fruitBox.add(new Fruit2());
        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());

        appleBox.add(new Apple2());
      //appleBox.add(new Grape2());   // 에러. Grape는 Apple의 자손이 아님.

        grapeBox.add(new Grape2());

        System.out.println("fruitBox-"+fruitBox);
        System.out.println("appleBox-"+appleBox);
        System.out.println("grapeBox-"+grapeBox);
    }
}

class FruitBox<T extends Fruit2 & Eatable> extends Box2<T> {}
// FruitBox에는 Fruit2의 자손이면서 Eatable을 구현한 클래스만 타입 매개변수 T에 대입될 수 있음.

class Box2<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item)  { list.add(item); }
    T get(int i)      { return list.get(i); }
    int size()        { return list.size(); }
    public String toString() { return list.toString();}
}

package ch7_oop2;

class Product1 {
    int price;
    int bonusPoint;

    Product1(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }

    Product1() {}
}

class Tv2 extends Product1 {
    Tv2() { super(100); }

    public String toString() { return "Tv";}
}

class Computer2 extends Product1 {
    Computer2() { super(200);}
    public String toString() { return "Computer";}
}

class Audio extends Product1 {
    Audio() { super(50);}
    public String toString() { return "Audio";}
}

class Buyer1 {
    int money = 1000;
    int bonusPoint = 0;
    Product1[] item = new Product1[10];
    int i= 0;

    void buy(Product1 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p + "을/를 구입하였습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for(int i=0; i<item.length; i++) {
            if(item[i]==null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer1 b = new Buyer1();

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio());
        b.summary();

    }
}

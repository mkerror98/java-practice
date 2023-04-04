package ch11_collections_framework;
import java.util.*;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to   = "d";

        set.add("abc");      set.add("alien");      set.add("abt");
        set.add("car");      set.add("Car");        set.add("disc");
        set.add("dance");    set.add("dZZZZ");      set.add("dzzzz");
        set.add("elephant"); set.add("elevator");   set.add("fan");
        set.add("flower");

        System.out.println(set);
        System.out.println("range search : from " + from +" to " + to);
        System.out.println("result1 : " + set.subSet(from, to));
        System.out.println("result2 : " + set.subSet(from, to + "zzz"));
        // 끝 범위인 d로 시작하는 단어까지 포함시키고자 할 때 이렇게 한다.
        // d로 시작하는 단어 중 'dzzz'다음에 오는 단어는 없을 것이기 때문에 d로 시작하는 모든 단어들이 포함될 것이다.
    }
}

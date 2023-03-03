package ch11_collections_framework;

import java.util.*;

public class IteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);        // List클래스들은 저장순서를 유지하기 때문에 Iterator를 이용해서 읽어온 결과 역시 저장순서와 동일.
        }

    }
}

package ch11_collections_framework;

import java.util.*;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5);       // 용량(capacity)이 5인 Vector를 생성.
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize();        // 빈 공간을 없앤다. (용량과 크기가 같아진다.)
        System.out.println("\n=== After trimToSize() ===");
        print(v);

        // v.ensureCapacity(6);는 v의 capacity가 최소한 6이 되도록 한다. v의 capacity가 6 이상이라면 아무 일도 일어나지 않는다.
        v.ensureCapacity(6);
        System.out.println("\n=== After ensureCapacity");
        print(v);

        v.setSize(7);     // v.setSize(7);는 v의 size가 7이 되도록 한다.
        // 만일 v의 capacity가 충분하면 새로 인스턴스를 생성하지 않아도 되지만 현재 capacity가 6이므로 새로운 인스턴스를 생성해야 한다.
        // Vector는 capacity가 부족할 경우 자동적으로 기존의 크기보다 2배의 크기로 증가되기 때문에 v의 capacity는 12로 증가한다.
        System.out.println("\n=== After setSize(7) ===");
        print(v);

        v.clear();      // v의 모든 요소를 삭제한다.
        System.out.println("\n--- After clear() ===");
        print(v);

    }

    public static void print(Vector v) {
        System.out.println(v.toString());
        System.out.println("size :" + v.size());
        System.out.println("capacity :" + v.capacity());
    }
}



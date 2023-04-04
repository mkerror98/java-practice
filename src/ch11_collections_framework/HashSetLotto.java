package ch11_collections_framework;
import java.util.*;

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        for(int i=0; set.size()<6; i++) {
            int num = (int)(Math.random()*45) +1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set);   // LinkedList(Collection c)
        Collections.sort(list);            // Collections.sort(List list)
        /* 번호를 크기순으로 정렬하기 위해 Collections클래스의 sort(List list)를 사용.
           이 메서드는 인자로 List인터페이스 타입을 필요로 하기 때문에 LinkedList클래스의 생성자(LinkedList(Collection c)를 이용해서
           HashSet에 저장된 객체들을 LinkedList에 담아서 처리했다. */

        System.out.println(list);
    }
}

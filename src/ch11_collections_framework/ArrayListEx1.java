package ch11_collections_framework;

import java.util.*;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));    // list1의 인덱스 1<=x<4 까지 (4,2,0)을 list2에 저장.
        print(list1, list2);

        Collections.sort(list1);        // list1의 요소들을 오름차순 정렬.
        Collections.sort(list2);        // list2의 요소들을 오름차순 정렬.
        print(list1,list2);

        // list1에 list2의 모든 요소들이 포함되어 있는가 ? 맞으면 true, 아니면 false 반환.
        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

        list2.add("B");     // list2 끝에 문자열 "B" 추가.
        list2.add("C");     // list2 끝에 문자열 "C" 추가.
        list2.add(3, "A");      // list2의 인덱스 3 자리에 문자열 "A"를 저장.
        print(list1, list2);

        list2.set(3, "AA");  // list2의 인덱스 3 자리를 "AA"로 변경.
        print(list1, list2);

        // list1에서 list2와 중복되는 요소들을 제외하고 삭제함. [0,1,2,3,4,5] 에서 [0,2,4] 중복. 변화가 있으면 true, 없으면 false 반환. 변화가 있으므로 true 반환.
        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
        print(list1,list2);

        // list2에서 list1와 중복되는 요소를 제거함. [0, 2, 4, AA, B, C] - [0, 2, 4] = [AA, B, C]
        for(int i= list2.size()-1; i>=0; i--) {
            if(list1.contains(list2.get(i)))
                list2.remove(i);
    }
        print(list1,list2);
}

    // list1와 list2를 출력하는 메서드.
    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("List1:" + list1);
        System.out.println("List2:" + list2);
        System.out.println();
    }
}

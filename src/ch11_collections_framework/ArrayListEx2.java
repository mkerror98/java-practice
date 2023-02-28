package ch11_collections_framework;

import java.util.*;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;              // 자르고자 하는 글자의 개수를 지정.
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()zzz";
        int length = source.length();        // length = 43

        List list = new ArrayList(length / LIMIT+10);     //  14 ?


        for(int i=0; i<length; i+=LIMIT) {
            if(i+LIMIT < length)
                list.add(source.substring(i, i+LIMIT));
            else
                list.add(source.substring(i));
        }
        //list[0]에 "0123456789", list[1]에 "abcdefghij", list[2]에 "ABCDEFGHIJ", list[3]에 "!@#$%^&*()", list[4]에 "zzz"가 저장되었음.


        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

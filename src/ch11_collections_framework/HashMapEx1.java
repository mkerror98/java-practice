package ch11_collections_framework;
import java.util.*;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner s = new Scanner(System.in);    // 화문으로부터 라인단위로 입력받는다.

        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.println("id :");
            String id = s.nextLine().trim();    // 입력받은 값을 공백을 제외하고 id에 저장.

            System.out.println("password :");
            String password = s.nextLine().trim();   // 입력받은 값을 공백을 제외하고 password에 저장.
            System.out.println();

            if(!map.containsKey(id)) {    // id가 포함되어 있지 않으면
                System.out.println("입력하신 id는 존재하지 않습니다." + "다시 입력해주세요.");

                continue;
            }

            if(!(map.get(id)).equals(password)) {  // key(id의 값)와 value(password)가 같지 않으면
                System.out.println("입력하신 id는 존재하지 않습니다." + "다시 입력해주세요.");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }
}

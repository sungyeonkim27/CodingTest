package 해시예제;

import java.util.HashMap;

/*
문제 2. 전화번호부 만들기
사람 이름과 전화번호를 저장하는 PhoneBook을 만드세요.
이름을 Key, 전화번호를 Value로 저장합니다.
사용자가 이름을 입력하면 전화번호를 출력하도록 하세요.

*/
public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        // 데이터 추가
        phoneBook.put("Alice", "010-1234-5678");
        phoneBook.put("Bob", "010-9876-5432");
        phoneBook.put("Charlie", "010-5555-1111");

        System.out.println(phoneBook.get("Alice"));
        System.out.println(phoneBook.get("Bob"));

        // 전체 출력
        for (String name : phoneBook.keySet()) {
            System.out.println(name + " -> " + phoneBook.get(name));
        }
    }
}

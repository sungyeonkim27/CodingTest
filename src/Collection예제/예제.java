package Collection예제;

import java.util.*;

public class 예제 {
    public static void main(String[] args) {
        // 1. List 예제 (순서 O, 중복 O)
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("바나나");
        list.add("사과"); // 중복 허용
        System.out.println("List 출력: " + list);

        // 2. Set 예제 (순서 X, 중복 X)
        Set<String> set = new HashSet<>();
        set.add("사과");
        set.add("바나나");
        set.add("사과"); // 중복은 무시됨
        System.out.println("Set 출력: " + set);

        // 3. Map 예제 (key-value 구조, key 중복 X)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "사과");
        map.put(2, "바나나");
        map.put(1, "포도"); // key=1 덮어쓰기
        System.out.println("Map 출력: " + map);
    }
}

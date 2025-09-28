package 해시예제;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        // 해시 맵 생성
        HashMap<String, Integer> studentScore = new HashMap<>();

        // 데이터 삽입
        studentScore.put("김성연", 90);
        studentScore.put("이다은", 80);
        studentScore.put("광철수", 70);

        //키 중복, 덮어쓰기
        studentScore.put("김성연", 100);

        //데이터 조회
        System.out.println(studentScore.get("김성연"));
        System.out.println(studentScore.get("광철수"));

        // 키 확인
        if (studentScore.containsKey("이다은")) {
            System.out.println("키 존재 확인");
        }

        //삭제
        studentScore.remove("김성연");
        System.out.println("삭제확인용" + studentScore.get("김성연"));

    }


}

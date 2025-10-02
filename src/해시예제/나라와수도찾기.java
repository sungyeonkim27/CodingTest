package 해시예제;

import java.util.HashMap;
import java.util.Scanner;

public class 나라와수도찾기 {
    public static void main(String[] args) {

        HashMap<String, String> countries = new HashMap<>();

        countries.put("한국","서울");
        countries.put("일본","도쿄");
        countries.put("미국","워싱턴 D.C");
        countries.put("영국", "런던");

        Scanner sc = new Scanner(System.in);
        System.out.print("나라이름을 입력하세요: ");
        String country = sc.next();

        if (countries.containsKey(country)) {
            System.out.println(country + "의 수도는 " + countries.get(country) + "입니다.");
        } else {
            System.out.println(country + "는 등록되지 않은 나라입니다.");
        }

        sc.close();
    }
}

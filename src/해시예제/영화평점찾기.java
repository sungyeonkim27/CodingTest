package 해시예제;

import java.util.HashMap;
import java.util.Scanner;

public class 영화평점찾기 {
    public static void main(String[] args) {

        HashMap<String, String> countries = new HashMap<>();

        countries.put("인셉션","9.0");
        countries.put("어벤져스","8.5");
        countries.put("타이타닉","9.9");
        countries.put("씽", "5.5");

        Scanner sc = new Scanner(System.in);
        System.out.print("영화이름을 입력하세요: ");
        String country = sc.next();

        if (countries.containsKey(country)) {
            System.out.println(country + "의 평점은 " + countries.get(country) + "입니다.");
        } else {
            System.out.println("등록되지 않은 영화입니다.");
        }

        sc.close();
    }
}

package bakjun_private.시간복잡도.알고리즘수업_알고리즘의수행시간6;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();  // n 최대 500,000 → 반드시 long 사용
        System.out.println(n * (n - 1) * (n - 2) / 6); // 수행 횟수
        System.out.println(3);                         // 최고차항 차수
    }
}

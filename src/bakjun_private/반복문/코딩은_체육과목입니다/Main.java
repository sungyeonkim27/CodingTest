package bakjun_private.반복문.코딩은_체육과목입니다;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N % 4 != 0) {
            System.out.println("N은 4의 배수가 아닙니다.");
            return;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N / 4; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb.toString());
    }
}

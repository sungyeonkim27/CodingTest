package bakjun_private.시간복잡도.알고리즘수업_알고리즘의수행시간6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= N - 2; i++) {
            sum += i * (i + 1) / 2;
        }
        System.out.println(sum);
        System.out.println(3);
    }
}

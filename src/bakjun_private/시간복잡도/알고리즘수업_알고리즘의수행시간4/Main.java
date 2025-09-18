package bakjun_private.시간복잡도.알고리즘수업_알고리즘의수행시간4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        System.out.println(N * (N - 1) / 2);
        System.out.println(2);
    }
}

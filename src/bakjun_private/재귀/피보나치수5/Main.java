package bakjun_private.재귀.피보나치수5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int[] fibonacci = new int[21];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i <= N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.print(fibonacci[N]);
    }
}

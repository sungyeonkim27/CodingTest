package bakjun_private.재귀.팩토리얼2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long result = 1;
        if (N <= 1) {
            System.out.print(result);
        } else {

            for (int i = 2; i <= N; i++) {
                result *= i;
            }
            System.out.print(result);
        }
    }
}

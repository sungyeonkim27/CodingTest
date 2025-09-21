package bakjun_private.브루트포스.분해합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;

        for (int i = 1; i < N; i++) {
            int quota = i;
            int sum = 0;
            do {
                sum += quota % 10;
                quota = quota / 10;
            } while (quota != 0);

            int result = sum + i;

            if (N == result) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);

    }
}

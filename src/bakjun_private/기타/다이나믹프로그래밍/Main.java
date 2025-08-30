package bakjun_private.기타.다이나믹프로그래밍;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dp = new int[N + 1];
        int[] before = new int[N + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;

        for (int i = 2; i < N + 1; i++) {
            if (dp[i - 1] + 1 < dp[i]) {
                dp[i] = dp[i - 1] + 1;
                before[i] = i - 1;
            }

            if (i % 2 == 0 && dp[i / 2] + 1 < dp[i]) {
                dp[i] = dp[i / 2] + 1;
                before[i] = i / 2;
            }

            if (i % 3 == 0 && dp[i / 3] + 1 < dp[i]) {
                dp[i] = dp[i / 3] + 1;
                before[i] = i / 3;
            }
        }

        System.out.println(dp[N]);

        StringBuilder sb = new StringBuilder();
        int current = N;
        while (current > 0) {
            sb.append(current).append(" ");
            current = before[current];
        }
        System.out.println(sb.toString().trim());
    }
}

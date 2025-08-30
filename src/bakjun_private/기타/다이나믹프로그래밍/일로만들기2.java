package bakjun_private.기타.다이나믹프로그래밍;

import java.util.*;

public class 일로만들기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dp = new int[N + 1];
        int[] before = new int[N + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            // 1을 뺀 경우
            if (dp[i - 1] + 1 < dp[i]) {
                dp[i] = dp[i - 1] + 1; // dp[2] = 1
                before[i] = i - 1; // before[2] = 1
            }

            // 2로 나눠지는 경우
            if (i % 2 == 0 && dp[i / 2] + 1 < dp[i]) {
                dp[i] = dp[i / 2] + 1;
                before[i] = i / 2;
            }

            // 3으로 나눠지는 경우
            if (i % 3 == 0 && dp[i / 3] + 1 < dp[i]) {
                dp[i] = dp[i / 3] + 1;
                before[i] = i / 3;
            }
        }

        // 최소 연산 횟수 출력
        System.out.println(dp[N]);

        // 경로 출력
        StringBuilder sb = new StringBuilder();
        int current = N;
        while (current > 0) {
            sb.append(current).append(" ");
            current = before[current];
        }

        System.out.println(sb.toString().trim());
    }
}
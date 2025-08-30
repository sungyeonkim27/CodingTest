package bakjun_private.기타.다이나믹프로그래밍;

import java.util.Scanner;

public class 평범한배낭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 물건 수
        int K = sc.nextInt(); // 배낭 최대 무게

        int[] W = new int[N];
        int[] V = new int[N];

        for (int i = 0; i < N; i++) {
            W[i] = sc.nextInt(); // 무게
            V[i] = sc.nextInt(); // 가치
        }

        int[] dp = new int[K + 1];

        for (int i = 0; i < N; i++) {
            for (int j = K; j >= W[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - W[i]] + V[i]);
            }
        }

        System.out.println(dp[K]);
    }
}

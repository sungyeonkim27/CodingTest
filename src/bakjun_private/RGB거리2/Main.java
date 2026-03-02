package bakjun_private.RGB거리2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static final int INF = 1000 * 1000 + 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int result = INF;
        int[][] cost = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            for (int j = 0; j < 3; j++) {
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 첫번째 집의 색을 지정
        for (int firstColor = 0; firstColor < 3; firstColor++) {
            int[][] dp = new int[N][3];

            for (int i = 0; i < 3; i++) {
                if (i == firstColor) {
                    dp[0][i] = cost[0][i];
                } else {
                    dp[0][i] = INF;
                }
            }
            for (int i = 1; i < N; i++) {
                dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i][0];
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i][1];
                dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i][2];
            }

            //첫번째와 마지막이 다른 경로는 제외하고 비용을 저장
            for (int lastColor = 0; lastColor < 3; lastColor++) {
                if (lastColor != firstColor) {
                    result = Math.min(result, dp[N - 1][lastColor]);
                }
            }
        }
        System.out.println(result);
    }

}

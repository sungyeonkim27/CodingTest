package bakjun_private.RGB거리2.클로드풀이;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static final int INF = 1000 * 1000 + 1; // 충분히 큰 값

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int[][] cost = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            for (int j = 0; j < 3; j++) {
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = INF;

        // 첫 번째 집의 색을 R, G, B로 각각 고정
        for (int firstColor = 0; firstColor < 3; firstColor++) {
            int[][] dp = new int[N][3];

            // 초기화: 첫 번째 집
            for (int j = 0; j < 3; j++) {
                if (j == firstColor) {
                    dp[0][j] = cost[0][j];
                } else {
                    dp[0][j] = INF; // 선택 불가
                }
            }

            // DP 진행
            for (int i = 1; i < N; i++) {
                dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0];
                dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1];
                dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2];
            }

            // 마지막 집은 첫 번째 집과 색이 달라야 함
            for (int lastColor = 0; lastColor < 3; lastColor++) {
                if (lastColor != firstColor) {
                    answer = Math.min(answer, dp[N-1][lastColor]);
                }
            }
        }

        System.out.println(answer);
    }
}

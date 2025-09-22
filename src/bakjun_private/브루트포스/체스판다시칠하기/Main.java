package bakjun_private.브루트포스.체스판다시칠하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int minCount = M * N;

        boolean[][] chess = new boolean[N][M];
        // 주어진 보드를 배열에 저장
        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'W') {
                    chess[i][j] = true;
                } else {
                    chess[i][j] = false;
                }
            }
        }

        // 색칠할 보드 개수 세기
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                if (minCount > isChess(i, j, chess)) {
                    minCount = isChess(i, j, chess);
                }
            }
        }

        System.out.println(minCount);


    }

    public static int isChess(int x, int y, boolean[][] chess) {
        boolean zeroPoint = chess[x][y];
        int count = 0;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if ((i + j) % 2 == 0 && zeroPoint != chess[i][j]) {
                    count++;
                } else if ((i + j) % 2 != 0 && zeroPoint == chess[i][j]) {
                    count++;
                }
            }
        }
        // W, B 중 더 적게 칠하는 색을 반환
        return Math.min(count, 64 - count);
    }
}

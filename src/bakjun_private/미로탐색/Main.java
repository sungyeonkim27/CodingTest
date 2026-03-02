package bakjun_private.미로탐색;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        int answer = -1;
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] maps = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                maps[i][j] = line.charAt(j) - '0';
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        int[][] visited = new int[N][M];
        visited[0][0] = 1;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            if (x == N - 1 && y == M - 1) {
                answer = visited[x][y];
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 기저조건
                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }

                if (maps[nx][ny] == 0 || visited[nx][ny] != 0) {
                    continue;
                }

                visited[nx][ny] = visited[x][y] + 1;
                queue.offer(new int[]{nx, ny});
            }
        }

        System.out.println(answer);
    }
}
/*
4 6
101111
101010
101011
111011
 */

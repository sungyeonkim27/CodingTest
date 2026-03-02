package programmers.깊이너비우선탐색DFSBFS.게임맵최단거리.제출;


import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int[][] visit = new int[n][m];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        visit[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            if (x == n - 1 && y == m - 1) {
                return visit[x][y];
            }

            for (int i = 0; i < 4; i++) {
                int fx = x + dx[i];
                int fy = y + dy[i];


                if (fx < 0 || fx >= n || fy < 0 || fy >= m) {
                    continue;
                }

                if (maps[fx][fy] == 0 || visit[fx][fy] != 0 ) {
                    continue;
                }
                visit[fx][fy] = visit[x][y] + 1;
                queue.offer(new int[]{fx, fy});
            }
        }
        return -1;
    }
}

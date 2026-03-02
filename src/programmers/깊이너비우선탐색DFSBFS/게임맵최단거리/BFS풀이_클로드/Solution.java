package programmers.깊이너비우선탐색DFSBFS.게임맵최단거리.BFS풀이_클로드;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        Solution gd = new Solution();
        int[][] maps = new int[][]{
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}
        };
        System.out.println(gd.solution(maps));
    }
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        // 방향 벡터: 상, 하, 좌, 우
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // 방문 체크 겸 거리 저장
        int[][] visited = new int[n][m];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = 1; // 시작점 거리 1

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // 목표 지점 도달
            if (x == n - 1 && y == m - 1) {
                return visited[x][y];
            }

            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 체크
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }

                // 벽이거나 이미 방문한 곳
                if (maps[nx][ny] == 0 || visited[nx][ny] != 0) {
                    continue;
                }

                // 방문 처리 및 거리 갱신
                visited[nx][ny] = visited[x][y] + 1;
                queue.offer(new int[]{nx, ny});
            }
        }

        // 목표 지점에 도달하지 못함
        return -1;
    }
}


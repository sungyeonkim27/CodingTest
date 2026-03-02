package programmers.깊이너비우선탐색DFSBFS.게임맵최단거리.BFS풀이_내가푼것;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        int answer = 0;
        Solution gd = new Solution();
        int[][] maps = new int[][]{
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}
        };
        answer = gd.solution(maps);
        System.out.println(answer);
    }
    // bfs는 큐-반복문으로 풀어야한다. 재귀x
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int[][] visit = new int[n][m];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        visit[0][0] = 1;

        // 반복문 - 큐의 모든 내용물을 꺼낸다.
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            System.out.println("현재 노드");
            System.out.println("x = " + x);
            System.out.println("y = " + y);

            // 완료조건
            if (x == n - 1 && y == m - 1) {
                return visit[x][y];
            }

            // 반복문 - 모든 분기를 확인하고 확인된 노드만 큐에 담는다.
            for (int i = 0; i < 4; i++) {
                // 기저조건
                int fx = x + dx[i];
                int fy = y + dy[i];

                System.out.println("fx = " + fx);
                System.out.println("fy = " + fy);

                // 큐에 담기 전에 기저조건 확인
                if (fx < 0 || fx >= n || fy < 0 || fy >= m) {
                    System.out.println("범위를 벗어남");
                    continue;
                }

                if (maps[fx][fy] == 0 || visit[fx][fy] != 0 ) {
                    System.out.println("벽이거나 지나간 곳");
                    continue;
                }
                visit[fx][fy] = visit[x][y] + 1;
                queue.offer(new int[]{fx, fy});
            }
        }
        return -1;
    }
}
/*
maps
[
    [1,0,1,1,1],
    [1,0,1,0,1],
    [1,0,1,1,1],
    [1,1,1,0,1],
    [0,0,0,0,1]
]
answer
11

[
    [1,0,1,1,1],
    [1,0,1,0,1],
    [1,0,1,1,1],
    [1,1,1,0,0],
    [0,0,0,0,1]
]

-1
 */
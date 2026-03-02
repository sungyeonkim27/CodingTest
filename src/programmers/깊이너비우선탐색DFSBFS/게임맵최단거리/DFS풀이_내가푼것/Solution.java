package programmers.깊이너비우선탐색DFSBFS.게임맵최단거리.DFS풀이_내가푼것;

public class Solution {
    int answer = -1;
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
        int[] point = new int[]{0, 0};
        int[] target = new int[]{maps.length - 1, maps[0].length - 1};
        System.out.println("target[0] = " + target[0]);
        System.out.println("target[1] = " + target[1]);
        int[][] depth = new int[maps.length][maps[0].length];
        dfs(maps, point, 1, target, depth);
        return answer;
    }

    public void dfs(int[][] maps, int[] point, int curDepth, int[] target, int[][] depth) {
        System.out.println("point x= " + point[0]);
        System.out.println("point y= " + point[1]);
        System.out.println("curDepth = " + curDepth);

        int x = point[0];
        int y = point[1];

        //기저 조건
        // 1. 맵을 벗어나지 말것
        if (x < 0 || x >= maps.length){
            System.out.println("맵을 벗어남");
            return;
        }

        if (y < 0 || y >= maps[0].length){
            System.out.println("맵을 벗어남");
            return;
        }

        // 2. 벽이 있는곳(0)은 가지 말것
        if (maps[x][y] == 0){
            System.out.println("벽");
            return;
        }

        // 3. 지나왔던 곳인지 확인
        System.out.println("depth = " + depth[x][y]);
        if (depth[x][y] <= curDepth && depth[x][y] != 0) {
            System.out.println("지났던 곳");
            return;
        }

        // 지나간 곳은 현재 깊이 저장
        depth[x][y] = curDepth;

        // 최솟값은 -1을 제외한 결과값중 가장 작은 수를 저장
        if (x == target[0] && y == target[1]) {
            if (answer == -1) {
                System.out.println("첫저장");
                answer = curDepth;
                return;
            } else if (answer > 0) {
                System.out.println("업데이트");
                answer = Math.min(answer, curDepth);
                return;
            }
        }

        curDepth++;
        // 동
        dfs(maps, new int[]{x, y + 1}, curDepth, target, depth);
        // 서
        dfs(maps, new int[]{x, y - 1}, curDepth, target, depth);
        // 남
        dfs(maps, new int[]{x + 1, y}, curDepth, target, depth);
        // 북
        dfs(maps, new int[]{x - 1, y}, curDepth, target, depth);

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

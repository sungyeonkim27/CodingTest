package programmers.깊이너비우선탐색DFSBFS.타겟넘버.DFS풀이;

public class Solution {
    int result = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, numbers.length, 0);
        return result;
    }

    public void dfs(int[] numbers, int target, int curDepth, int arrDepth, int sum) {
        if (curDepth >= arrDepth) {
            return;
        }
        int plusSum = sum + numbers[curDepth];
        int minusSum = sum - numbers[curDepth];

        if (curDepth == arrDepth - 1) {
            if (plusSum == target || minusSum == target) {
                result++;
            }
        }
        // + 연산
        dfs(numbers, target, curDepth + 1, arrDepth, plusSum);
        // - 연산
        dfs(numbers, target, curDepth + 1, arrDepth, minusSum);

    }
}

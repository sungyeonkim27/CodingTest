package bakjun_private.기타.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class 가장긴증가하는부분수열4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        int[] dp = new int[N];
        int[] before = new int[N];


        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
            before[i] = -1;
        }

        int maxLen = 1;
        int lastIndex = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    before[i] = j;
                }
            }

            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastIndex = i;
            }
        }

        System.out.println(maxLen);

        Stack<Integer> stack = new Stack<>();
        while (lastIndex != -1) {
            stack.push(A[lastIndex]);
            lastIndex = before[lastIndex];
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

package bakjun_private.스택큐덱1.요세푸스문제0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Deque<Integer> stack = new ArrayDeque<>();


        for (int i = 1; i <= N; i++) {
            stack.add(i);
        }

        StringBuilder sb = new StringBuilder();
        //스텍이 남아있으면 계속 -> 빌때까지 계속
        sb.append("<");
        while (!stack.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                stack.add(stack.poll());
            }

            sb.append(stack.poll());
            if (!stack.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);

    }
}


package bakjun_private.스택큐덱1.스택2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> stack = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String commend = br.readLine();
            if (commend.startsWith("1")) {
                int X = Integer.parseInt(commend.split(" ")[1]);
                stack.push(X);
            } else if (commend.equals("2")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else if (commend.equals("3")) {
                sb.append(stack.size()).append("\n");
            } else if (commend.equals("4")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (commend.equals("5")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }
}

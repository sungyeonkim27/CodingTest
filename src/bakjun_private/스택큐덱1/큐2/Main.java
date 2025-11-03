package bakjun_private.스택큐덱1.큐2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String commend = br.readLine();

            if (commend.startsWith("push")) {
                int X = Integer.parseInt(commend.split(" ")[1]);
                queue.offer(X);
            } else if (commend.equals("pop")) {
                sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
            } else if (commend.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (commend.equals("empty")) {
                sb.append(queue.isEmpty() ? 1 : 0).append("\n");
            } else if (commend.equals("front")) {
                sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
            } else if (commend.equals("back")) {
                sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n");
            }
        }

        System.out.println(sb);
    }
}

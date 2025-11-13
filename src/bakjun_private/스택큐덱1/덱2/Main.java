package bakjun_private.스택큐덱1.덱2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            if (command.startsWith("1")) {
                deque.push(Integer.parseInt(command.split(" ")[1]));
            } else if (command.startsWith("2")) {
                deque.add(Integer.parseInt(command.split(" ")[1]));
            } else if (command.equals("3")) {
                sb.append(deque.isEmpty() ? -1 : deque.pop()).append("\n");
            } else if (command.equals("4")) {
                sb.append(deque.isEmpty() ? -1 : deque.removeLast()).append("\n");
            } else if (command.equals("5")) {
                sb.append(deque.size()).append("\n");
            } else if (command.equals("6")) {
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("7")) {
                sb.append(deque.isEmpty() ? -1 : deque.peek()).append("\n");
            } else if (command.equals("8")) {
                sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
            }

            }
        System.out.println(sb);
    }
}

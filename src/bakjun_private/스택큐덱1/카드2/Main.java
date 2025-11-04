package bakjun_private.스택큐덱1.카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        while (true) {
            if (queue.size() == 1) {
                System.out.print(queue.pop());
                break;
            }
            queue.poll();
            queue.offer(queue.poll());
        }
    }
}

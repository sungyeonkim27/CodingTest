package bakjun_private.스택큐덱1.풍선터뜨리기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            int move = Integer.parseInt(st.nextToken());
            deque.add(new int[]{i, move});
        }

        StringBuilder sb = new StringBuilder();

        int[] cur = deque.pollFirst();
        sb.append(cur[0]).append(" ");

        int move = cur[1];

        while (!deque.isEmpty()) {
            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
                cur = deque.pollFirst();
            } else {
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
                cur = deque.pollFirst();
            }

            sb.append(cur[0]).append(" ");
            move = cur[1];
        }

        System.out.println(sb.toString().trim());
    }
}


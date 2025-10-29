package bakjun_private.스택큐덱1.제로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> stack = new ArrayDeque<>();

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            int command = Integer.parseInt(br.readLine());

            if (command == 0) {
                stack.pop();
            } else {
                stack.push(command);
            }
        }
        long sum = 0;
        for (Integer num : stack) {
            sum += num;
        }
        System.out.print(sum);
    }
}

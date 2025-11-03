package bakjun_private.스택큐덱1.도키도키간식드리미;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> subLine = new Stack<>();
        int order = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == order) {
                order++;
            } else {
                subLine.push(num);
            }

            while (!subLine.isEmpty() && subLine.peek() == order) {
                subLine.pop();
                order++;
            }

        }
        if (subLine.isEmpty()) {
            System.out.print("Nice");
        } else {
            System.out.print("Sad");
        }


    }
}

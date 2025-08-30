package bakjun_private.기타.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class 카드정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> cards = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int total = 0;

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            int sum = a + b;
            total += sum;
            pq.add(sum);
        }

        System.out.println(total);
    }
}
//PriorityQueue를 안쓰고 시간제한 통과가 가능한지 모르겠네요... 결국 포기하고 PriorityQueue사용합니다.

package bakjun_private.힙소트2220.클로드풀이;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] heap = new int[n + 1];
        int value = n;

        // 레벨별로 처리
        for (int level = 0; (1 << level) <= n; level++) {
            int start = 1 << level;
            int end = Math.min((1 << (level + 1)) - 1, n);

            // 이 레벨을 오른쪽부터 채우기
            for (int i = end; i >= start; i--) {
                heap[i] = value--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(heap[i]).append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}

/*
6 5 3 2 4 1

    6
  5   3
 2 4 1

5 4 3 2 1

 */

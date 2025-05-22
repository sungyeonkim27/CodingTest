package reverseBasket;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer NM = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());

        int[] basket = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }
        int[] rvsBasket = new int[N];

        for (int i = 0; i < M; i++) {
            StringTokenizer AB = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(AB.nextToken());
            int B = Integer.parseInt(AB.nextToken());

            int left = A - 1;
            int right = B - 1;
            while (left < right) {
                int temp = basket[left];
                basket[left] = basket[right];
                basket[right] = temp;
                left++;
                right--;
            }
        }
        for (int j = 0; j < N; j++) {
            bw.write(basket[j] + (j == N - 1 ? "":" "));
        }
        bw.flush();
        bw.close();
        br.close();

    }
}

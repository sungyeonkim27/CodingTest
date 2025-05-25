package bakjun_estsoft.putTheBall;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 바구니 수
        int M = Integer.parseInt(st.nextToken()); // 명령 수

        int[] basket = new int[N]; // 0으로 초기화됨

        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int idx = i - 1; idx <= j - 1; idx++) {
                basket[idx] = k;
            }
        }

        // 출력
        for (int i = 0; i < N; i++) {
            bw.write(basket[i] + (i == N - 1 ? "" : " "));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

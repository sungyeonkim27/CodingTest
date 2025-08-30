package bakjun_private.기타.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동전0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long K = Integer.parseInt(st.nextToken());

        long[] numbers = new long[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Long.parseLong(br.readLine());
        }
        long count = 0;
        for (int i = 0; i < N; i++) {
            count += K / numbers[N - 1 - i];
            K = K % numbers[N - 1 - i];
        }
        System.out.println(count);

    }
}

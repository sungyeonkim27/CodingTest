package bakjun_private.약수배수와소수2.가로수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] points = new long[N];
        long[] intervals = new long[N - 1];

        for (int i = 0; i < N; i++) {
            points[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N - 1; i++) {
            intervals[i] = points[i + 1] - points[i];
        }
        long interval = intervals[0];
        for (int i = 1; i < N - 1; i++) {
            interval = gcd(interval, intervals[i]);
        }

        long total = (points[N - 1] - points[0]) / interval + 1;
        System.out.println(total - N);

    }

}

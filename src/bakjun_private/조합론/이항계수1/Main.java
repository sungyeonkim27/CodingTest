package bakjun_private.조합론.이항계수1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int answer = factorial(N) / (factorial(K) * factorial(N - K));
        System.out.print(answer);
    }

    public static int factorial(int N) {
        if (N <= 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= N; i++) {
                result = result * i;
            }
            return result;
        }

    }
}

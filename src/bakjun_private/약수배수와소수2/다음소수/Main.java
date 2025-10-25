package bakjun_private.약수배수와소수2.다음소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean isPrime(long n) {
        // 2이하의 수 판별
        if (n < 2) return false;
        if (n == 2) return true;

        // 짝수 판별
        if (n % 2 == 0) return false;

        long sqrt = (long) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            long n = Long.parseLong(br.readLine());
            if (n <= 2) {
                sb.append(2).append("\n");
                continue;
            }

            while (true) {
                if (isPrime(n)) {
                    sb.append(n).append("\n");
                    break;
                }
                n++;
            }
        }
        System.out.println(sb);

    }
}

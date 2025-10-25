package bakjun_private.약수배수와소수2.베르트랑공준;

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
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int count = 0;

            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);

    }
}

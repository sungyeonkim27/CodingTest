package bakjun_private.약수배수와소수2.골드바흐파티션;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

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
        int[] numbers = new int[T];
        int max = 0;
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers[i] = num;
            if (num > max) {
                max = num;
            }
        }

        boolean[] primes = new boolean[max + 1];
        for (int i = 2; i < max + 1; i++) {
            if (isPrime(i)) {
                primes[i] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int count = 0;
            for (int j = 2; j <= numbers[i] / 2; j++) {
                if (primes[j] && primes[numbers[i] - j]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}

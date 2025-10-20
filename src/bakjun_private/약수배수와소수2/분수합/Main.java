package bakjun_private.약수배수와소수2.분수합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
        long[][] arr = new long[2][2];
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 분자
            arr[i][1] = Integer.parseInt(st.nextToken()); // 분모
        }

        long B = arr[0][1] * arr[1][1];
        long A = arr[0][0] * arr[1][1] + arr[1][0] * arr[0][1];
        long GCD = gcd(A, B);
        System.out.println(A / GCD + " " + B / GCD);


    }
}

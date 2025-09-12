package bakjun_private.약수배수와소수.약수들의합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            int sum = 1;
            StringBuilder sb = new StringBuilder();
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    sb.append(" + " + i);
                }
            }
            if (sum == n) {
                System.out.println(n + " = 1" + sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}

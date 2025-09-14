package bakjun_private.약수배수와소수.소수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int mix = N;
        for (int i = M; i <= N; i++) {
            if (decimal(i)) {
                sum += i;
                if (i < mix) {
                    mix = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(mix);
        }
    }

    public static boolean decimal(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum++;
            }
        }

        if (sum == 1) {
            return true;
        } else {
            return false;
        }
    }
}

package bakjun_private.피보나치수4;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        BigInteger[] fibonacci = new BigInteger[10001];
        fibonacci[0] = new BigInteger("0");
        fibonacci[1] = new BigInteger("1");
        for (int i = 2; i <= N; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
        }
        System.out.print(fibonacci[N]);
    }
}


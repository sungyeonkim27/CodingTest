package bakjun_private.시간복잡도.점근적표기법1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        if (a1 <= c && a0 <= (c - a1) * n0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        /*
        a1n + a0 <= c * n,
        a0 <= (c - a1) * n
        이것만 만족하면 됨 a0 <= (c - a1) * n0
         */
    }
}

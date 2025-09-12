package bakjun_private.수학1.중앙이동알고리즘;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int side = 2;
        for (int i = 0; i < N; i++) {
            side = side * 2 - 1;
        }
        int result = (int) Math.pow(side, 2);
        System.out.println(result);
    }
}

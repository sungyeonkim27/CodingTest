package bakjun_private.일차원배열.개수세기;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        int count = 0;

        for (int num : arr) {
            if (num == v) {
                count++;
            }
        }


        System.out.println(count);
    }
}

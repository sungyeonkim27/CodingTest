package bakjun_private.일차원배열.최소최대;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        int max = -1000000;
        int min = 1000000;
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (max < num) max = num;
            if (min > num) min = num;
        }
        System.out.println(min + " " + max);

    }
}

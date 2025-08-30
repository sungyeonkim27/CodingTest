package bakjun_private.반복문.AplusB7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A + B;
            System.out.println("Case #" + (i + 1) + ": " + sum);
        }
    }
}

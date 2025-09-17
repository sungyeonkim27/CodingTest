package bakjun_private.기하1직사각형과삼각형.세막대;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = A + B + C;
        int max = Math.max(Math.max(A, B), C);

        if (sum - max > max) {
            System.out.println(sum);
        } else {
            System.out.println(2 * (sum - max) - 1);
        }
    }
}

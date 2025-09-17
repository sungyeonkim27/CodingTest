package bakjun_private.기하1직사각형과삼각형.삼각형과세변;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int sum = A + B + C;

            if (A == 0) {
                break;
            }
            int max = Math.max(Math.max(A, B), C);

            if (sum - max <= max) {
                System.out.println("Invalid");
                continue;
            }

            if (B == C && C == A) {
                System.out.println("Equilateral");
            } else if (A == B || B == C || C == A) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}

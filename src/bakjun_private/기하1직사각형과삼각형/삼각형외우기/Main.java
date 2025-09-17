package bakjun_private.기하1직사각형과삼각형.삼각형외우기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = A + B + C;

        if (A == 60 && B == 60 && C == 60) {
            System.out.println("Equilateral");
        } else if (sum == 180) {
            if (A == B || B == C || C == A) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}

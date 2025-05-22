package dice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = 0;

        if (A == B && B == C && C == A) {
            result = 10000 + A * 1000;
        } else if (A == B || B == C || C == A) {
            if (A == B || A == C) {
                result = 1000 + A * 100;
            } else {
                result = 1000 + B * 100;
            }
        } else {
            int max = A;
            if (max < B) {
                max = B;
            }
            if (max < C) {
                max = C;
            }
            result = max * 100;
        }

        System.out.println(result);
    }
}

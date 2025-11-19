package bakjun_private.조합론.팩토리얼;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 0) {
            System.out.print(1);
        } else {
            long result = 1;
            for (int i = 1; i <= N; i++) {
                result = result * i;
            }
            System.out.print(result);
        }
    }
}

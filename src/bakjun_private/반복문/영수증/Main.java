package bakjun_private.반복문.영수증;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(scanner.nextLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum += a * b;
        }

        if (X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

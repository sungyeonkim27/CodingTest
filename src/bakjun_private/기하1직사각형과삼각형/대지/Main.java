package bakjun_private.기하1직사각형과삼각형.대지;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long xMin = 100000L;
        long yMin = 100000L;
        long xMax = -100000L;
        long yMax = -100000L;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            long x = sc.nextLong();
            if (x < xMin) {
                xMin = x;
            }
            if (x > xMax) {
                xMax = x;
            }

            long y = sc.nextLong();
            if (y < yMin) {
                yMin = y;
            }
            if (y > yMax) {
                yMax = y;
            }
        }

        long result = (xMax - xMin) * (yMax - yMin);
        System.out.println(result);
    }
}

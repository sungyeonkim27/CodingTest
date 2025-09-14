package bakjun_private.기하1직사각형과삼각형.네번째점;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int fourthX = 0;
        int fourthY = 0;
        if (x[0] == x[2]) {
            fourthX = x[1];
        } else if (x[1] == x[2]) {
            fourthX = x[0];
        } else {
            fourthX = x[2];
        }

        if (y[0] == y[2]) {
            fourthY = y[1];
        } else if (y[1] == y[2]) {
            fourthY = y[0];
        } else {
            fourthY = y[2];
        }

        System.out.println(fourthX + " " + fourthY);

    }
}

package bakjun_private.이차원배열.행렬덧셈;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st1 = new StringTokenizer(sc.nextLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(sc.nextLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st2.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(sc.nextLine());
            for (int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
    }
}

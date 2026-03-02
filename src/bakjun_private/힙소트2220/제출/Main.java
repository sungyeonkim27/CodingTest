package bakjun_private.힙소트2220.제출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n + 1];

        // 2부터 n까지 차례대로 삽입
        for (int i = 1; i < n; i++) {
            // 루트 경로의 값들을 한 칸씩 아래로
            for (int j = i; j > 1; j /= 2) {
                array[j] = array[j / 2];
            }
            // 루트에 i+1 삽입
            array[1] = i + 1;
        }

        // 마지막 위치에 1 삽입
        array[n] = 1;

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(array[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

/*
1.
6 5 3 2 4 1

    6
  5   3
 2 4 1

1 인 경우 1
2 인 경운 [2, 1]
3인 경우 [3,1,2] 혹은 [3,2,1]
4인 경우 [4, 3, 2, 1]
5인 경우 [ 5,4,3,2,1]

 */
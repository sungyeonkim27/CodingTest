package bakjun_private.수학1.진법변환2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int n = 0;
        int sum = 1;

        while (sum != 0) {
            n++;
            sum = N / (int) Math.pow(B, n);
        }

        int quota = 0;
        int rest = N;
        for (int i = n - 1; i >= 0; i--) {
            quota = rest / (int) Math.pow(B, i);
            rest = rest % (int) Math.pow(B, i);
            if (10 <= quota && quota <= 35) {
                sb.append((char) (quota - 10 + 'A'));
            } else {
                sb.append(quota);
            }
        }
        System.out.println(sb);
    }

    /*
    1. 먼저 주어진 숫자 N을 나눌 수 있는 B의 가장 큰 n제곱수를 찾는다.
    2. 가장 큰 n을 구한 후, 반복문을 사용해 N을 나눠서 n-1 자리에 몫을 기록한다.
    3. 그 다음 n-1을 나머지에 나눠서 n-2자리에 몫을 기록한다.
     */
}

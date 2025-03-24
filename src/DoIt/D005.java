/*
문제 005 나머지 합 구하기
N개의 수가 주어졌을때, 연속된 부분의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.

입력
N,M
N개의 수
출력
연속된 부분의 합이 M으로 나누어 떨어지는 구간의 개수를 출력

1단계 문제 분석하기
i + 1,j구간의 합은 S[j] - S[i] 과 같다.
M으로 나눈 나머지의 값이 같은 것을 빼면 그 값은 M으로 나누어 떨어진다.
따라서 S[j], S[j}의 나머지 값이 같으면 i+1부터 j까지의 구간합은 M으로 나누어 떨어진다.

02단계 손으로 풀어 보기
1)
배열 A
|1|2|3|1|2|
합 배열 S
|1|3|6|7|9|
2)
% M을 적용한 배열 S
|1|0|0|1|0|
3)
원소값이 0이면 합 배열이 M의 배수라는 의미이므로 카운트한다.
원소값이 0인 것의 갯수 :1
4)
원소값이 같은 인덱스 개수를 세고 경우의 수를 구하여 모두 더한다.
0이 3개, 1이 2개이므로
3C2, 2C2의 경우의 수를 구하여 더한다.

3C2 = 3
2C2 = 1

총 경우의 수 = 3 + 3 + 1 = 7

3단계 슈도코드

 */
package DoIt;

import java.util.Scanner;

public class D005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] S = new long[N];
        long[] C = new long[M];

        long answer = 0;

        S[0] = sc.nextInt();
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int remainder = (int) (S[i] % M);
            if (remainder == 0) answer++;
            C[remainder]++;
        }
        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                answer = answer + (C[i] * (C[i] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}

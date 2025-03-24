/*
문제 002
세준이는 자기 점수를 조작하기로 결심했다.
최댓값을 M이라고 할때, 모든 점수를 점수/M*100으로 고치고 새로운 평균을 출력하는 프로그램을 작성하시오.

입력
시험 본 과목 갯수 N과 세준이의 현재 성적이 주어짐.
출력
1번째 줄에 새로운 평균을 출력.

01단게 문제 분석하기
최고 점수를 기준으로 전체점수를 다시 계산해야하기 때문에, 최고점을 별도로 저장해야 한다.
변환점수의 평균을 구하는 식은 다음과 같다.
(A + B + C) * 100 / M / 3

02단계 손으로 풀어보기
1) 점수를 1차원 배열에 저장
2) 배열을 탐색하며 최고점수와 점수의 총합을 구함. (중요)
3) 게산식을 이용해 변환된 평균을 출력함

03단계 슈도코드 작성하기
변수 N을 입력받기
길이가 N인 배열 A[]선언
A[i]에 각 점수 저장
A[i]에서 최고점은 max, 총합은 sum에 저장
계산식으로 변환된 평균 출력.
 */
package DoIt;

import java.util.Scanner;

public class D002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        long max = 0;
        long sum = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] > max) max = A[i];
            sum += A[i];
        }

        System.out.println(sum * 100.0 / max /N);
    }
}

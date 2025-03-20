/*문제 숫자의 합구하기
    N개의 숫자가 공백없이 써있다. 이 숫자를 모두 합해 풀력하는 프로그램을 작성하시오.
    입력
    1번째 줄에 숫자의 개수 N(1<=N<=100),2번째줄에 숫자 N개가 공백없이 주어진다.
    출력
    입력으로 주어진 숫자 N개의 합을 출력한다.

    1단계 문제분석하기
    N의 범위를 생각하면 더해야하는 숫자를 숫자형으로 담을 수 없다. 먼저 문자열로 입력을 받고 이를 문자 배열로 변환하고, 문자배열값을 순서대로
    숫자형으로 변환하면서 더해야한다.
    2단계 손으로 풀어보기
    1) 숫자의 개수만큼 입력받은 값을 String형으로 저장합니다.
                String sNum = 10987654321
    2) String 형으로 입력받은 값을 char[]형으로 변환합니다.
    char |1|0|9|8|7|6|5|4|3|2|1|
    3) 인덱스 0부터 끝까지 배열을 탐색하면서 각 값을 정수형으로 변환하고 결괏값에 더하여 누적합니다.

    3단계 슈도코드 작성하기
    N값 입력받기
    길이 N의 숫자를 입력받아 String형 변수 sNum에 저잘하기
    int형 변수 sum 선언하기
    for(cNum 길이만큼 반복하기)
    {
    배열의 각 자릿값을 정수형으로 변환하며 sum에 더하여 누적하기
    }
    sum 출력하기

    */
package DoIt;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class D001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);

    }
}

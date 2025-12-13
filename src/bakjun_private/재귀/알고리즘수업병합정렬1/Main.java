package bakjun_private.재귀.알고리즘수업병합정렬1;

import java.io.*;
import java.util.*;

public class Main {
    static int[] A;
    static int[] tmp;
    static int count = 0;  // 저장 횟수 카운트
    static int K;
    static int result = -1;  // K번째 저장되는 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N];
        tmp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(A, 0, N - 1);

        System.out.println(result);
    }

    // 병합 정렬
    static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    // 병합 (의사코드 그대로 구현)
    static void merge(int[] A, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;  // Java 배열은 0부터 시작하므로 0으로 초기화

        // 두 부분 배열을 비교하며 tmp에 저장
        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }

        // 왼쪽 배열 부분이 남은 경우
        while (i <= q) {
            tmp[t++] = A[i++];
        }

        // 오른쪽 배열 부분이 남은 경우
        while (j <= r) {
            tmp[t++] = A[j++];
        }

        // ★ 핵심: tmp에서 A로 복사할 때 저장 횟수 카운트
        i = p;
        t = 0;
        while (i <= r) {
            count++;  // 저장 횟수 먼저 증가
            A[i++] = tmp[t++];
            if (count == K) {
                result = A[i - 1];  // 방금 저장한 값
            }
        }
    }
}

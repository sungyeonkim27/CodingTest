package bakjun_private.버블소트.머지소트풀이;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    static long count = 0;
    static int[] temp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[N];
        temp = new int[N];

        StringTokenizer st = new StringTokenizer(sc.nextLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(arr, 0, N - 1);

        System.out.println(count);
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int i = left; // 왼쪽 시작
        int j = mid + 1; // 오른쪽 시작
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int l = left; l <= right; l++) {
            arr[l] = temp[l];
        }


    }



}

/*
머지 소트로 풀어야 함

동작 원리
예제: [3, 2, 1]

분할: [3], [2], [1]
병합 1: [3]과 [2] 병합

2 < 3이므로 2가 먼저 → Inversion +1
결과: [2, 3]


병합 2: [2, 3]과 [1] 병합

1 < 2이므로 1이 먼저 → Inversion +2 (2와 3 모두보다 작음)
결과: [1, 2, 3]

총 Inversion: 3개

 */

package bakjun_private.기타.이진탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 수찾기 {
    public static int binarySeach(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);


        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            System.out.println(binarySeach(numbers, sc.nextInt()));
        }
    }
}



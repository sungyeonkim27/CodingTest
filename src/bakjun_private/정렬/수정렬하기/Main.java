package bakjun_private.정렬.수정렬하기;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        for (int num : nums) {
            System.out.println(num);
        }
    }
}

package bakjun_private.정렬.소트인사이드;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int[] numbers = new int[num.length()];

        for (int i = 0; i < num.length(); i++) {
            numbers[i] = num.charAt(i) - '0';
        }

        Arrays.sort(numbers);

        for (int i = 0; i < num.length(); i++) {
            System.out.print(numbers[num.length() - 1 - i]);
        }
    }
}

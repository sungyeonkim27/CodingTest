package bakjun_private.문자열.다이얼;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dial = sc.next();
        int time = 0;
        for (int i = 0; i < dial.length(); i++) {
            int num = dial.charAt(i) - 64;
            time += dialList(num) + 1;
        }
        System.out.println(time);
    }
    public static int dialList(int num) {
        int result = 0;
        if (1 <= num && num < 4) {
            result = 2;
        } else if (4 <= num && num < 7) {
            result = 3;
        } else if (7 <= num && num < 10) {
            result = 4;
        } else if (10 <= num && num < 13) {
            result = 5;
        } else if (13 <= num && num < 16) {
            result = 6;
        } else if (16 <= num && num < 20) {
            result = 7;
        } else if (20 <= num && num < 23) {
            result = 8;
        } else if (23 <= num && num < 27) {
            result = 9;
        }
        return result;
    }
}





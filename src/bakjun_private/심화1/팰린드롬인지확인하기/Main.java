package bakjun_private.심화1.팰린드롬인지확인하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int palind = 1;
        int length = word.length();
            for (int i = 0; i < length / 2; i++) {
                if (word.charAt(i) != word.charAt(length - 1 - i)) {
                    palind = 0;
                }
            }
        System.out.println(palind);
    }
}

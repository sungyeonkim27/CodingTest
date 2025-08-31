package bakjun_private.문자열.문자와문자열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int i = sc.nextInt();

        System.out.println(S.charAt(i - 1));

    }
}

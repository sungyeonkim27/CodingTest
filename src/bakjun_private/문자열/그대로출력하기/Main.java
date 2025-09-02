package bakjun_private.문자열.그대로출력하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}

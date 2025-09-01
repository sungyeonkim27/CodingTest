package bakjun_private.문자열.다이얼;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dial = sc.next();
        int time = 0;
        for (int i = 0; i < dial.length(); i++) {
            char word = dial.charAt(i);
            if ('A' <= word && word < 'D') {
                time += 3;
            } else if ('D' <= word && word < 'G') {
                time += 4;
            } else if ('G' <= word && word < 'J') {
                time += 5;
            } else if ('J' <= word && word < 'M') {
                time += 6;
            } else if ('M' <= word && word < 'P') {
                time += 7;
            } else if ('P' <= word && word < 'T') {
                time += 8;
            } else if ('T' <= word && word < 'W') {
                time += 9;
            } else if ('W' <= word && word <= 'Z') {
                time += 10;
            }
        }
        System.out.println(time);
    }
}

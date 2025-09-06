package bakjun_private.심화1.단어공부;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();
        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            count[ch - 'A']++;
        }

        int max = -1;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (max < count[i]) {
                max = count[i];
                result = (char) (i + 'A');
            } else if (max == count[i]) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}

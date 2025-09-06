package bakjun_private.심화1.그룹단어체커;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = sc.next();
            if (groupWordChecker(word)) {
                count++;
            }
        }

        System.out.println(count);

    }

    public static boolean groupWordChecker(String word) {
        boolean[] groupWords = new boolean[26];
        char prev = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch != prev) {
                if (groupWords[ch - 'a']) {
                    return false;
                }
                groupWords[ch - 'a'] = true;
            }
            prev = ch;
        }
        return true;
    }

    /*
    단어 체커
    1. 단어를 1글자씩 읽는다.
    2. 이전 글자와 다를때, 조건문 사용
    3. 이전 글자와 다를때, 해당 글자가 처음 등장한 글자이면 배열에 true라고 저장한다.
    4. 이전 글자와 다를때, 해당 글자가 이전에 등장한 글자이면 false를 return한다.
     */
}

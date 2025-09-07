// GPT 풀이
package bakjun_private.이차원배열.세로읽기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] words = new String[5];
        int maxLen = 0;

        // 5줄 입력받기
        for (int i = 0; i < 5; i++) {
            words[i] = br.readLine();
            maxLen = Math.max(maxLen, words[i].length()); // 가장 긴 문자열 길이 기록
        }

        StringBuilder sb = new StringBuilder();

        // 세로 읽기
        for (int col = 0; col < maxLen; col++) {
            for (int row = 0; row < 5; row++) {
                if (col < words[row].length()) { // 인덱스가 유효하면
                    sb.append(words[row].charAt(col));
                }
            }
        }
        System.out.println(sb);
    }
}

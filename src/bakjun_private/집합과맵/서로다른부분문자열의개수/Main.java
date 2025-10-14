package bakjun_private.집합과맵.서로다른부분문자열의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        Set<String> set = new HashSet<>();

        int N = word.length();
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                set.add(word.substring(i, j + 1));
            }
        }

        System.out.println(set.size());
    }
}

package bakjun_private.심화2.인사성밝은곰곰이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        Set<String> names = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.equals("ENTER")) {
                names.clear();
            } else {
                if (names.add(word)) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}

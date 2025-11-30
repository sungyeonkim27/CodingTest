package bakjun_private.심화2.붙임성좋은총총이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        Set<String> dance = new HashSet<>();
        dance.add("ChongChong");
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            if (dance.contains(A) ) {
                dance.add(B);
            } else if (dance.contains(B)) {
                dance.add(A);
            }
        }

        System.out.println(dance.size());
    }
}

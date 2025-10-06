package bakjun_private.집합과맵.문자열집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        Set<String> S = new HashSet<>();
        for (int i = 0; i < N; i++) {
            S.add(br.readLine());
        }

        int count = 0;

        for (int i = 0; i < M; i++) {
            if (S.contains(br.readLine())) {
                count++;
            }
        }
        System.out.println(count);
    }
}

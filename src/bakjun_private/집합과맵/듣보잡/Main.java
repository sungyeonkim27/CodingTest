package bakjun_private.집합과맵.듣보잡;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> names = new HashSet<>();

        for (int i = 0; i < N; i++) {
            names.add(br.readLine());
        }

        int count = 0;
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (names.contains(name)) {
                count++;
                result.add(name);
            }
        }
        Collections.sort(result);

        System.out.println(count);

        for (String name : result) {
            System.out.println(name);
        }

    }
}

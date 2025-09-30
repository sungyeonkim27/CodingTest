package bakjun_private.정렬.나이순정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[][] members = new String[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            members[i][0] = String.valueOf(i); // 가입 순서
            members[i][1] = String.valueOf(st.nextToken()); // 나이
            members[i][2] = String.valueOf(st.nextToken()); // 이름
        }

        Arrays.sort(members, (a, b) -> {
            if (Objects.equals(a[1], b[1])) {
                return Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
            } else {
                return Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1]));
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(members[i][1]).append(" ").append(members[i][2]).append("\n");
        }

        System.out.println(sb);
    }
}

package bakjun_estsoft.frame;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] grade = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            grade[i][0] = Integer.parseInt(st.nextToken());
            grade[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                } else if (grade[i][0] < grade[j][0] && grade[i][1] < grade[j][1]) {
                    count++;
                }
            }
            bw.write(count + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

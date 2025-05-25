package bakjun_estsoft.average;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer score = new StringTokenizer(br.readLine());
        int[] scores = new int[N];
        int M = 0;
        double sum = 0;
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(score.nextToken());
            sum += scores[i];
            if (M < scores[i]) {
                M = scores[i];
            }
        }
        bw.write((sum* 100) / (double) (M * N) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}

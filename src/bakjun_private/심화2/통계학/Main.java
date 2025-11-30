package bakjun_private.심화2.통계학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int max = -4001;
        int min = 4001;

        int[] freq = new int[8001];

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            sum += x;

            freq[x + 4000]++;

            if (max < x) {
                max = x;
            }
            if (min > x) {
                min = x;
            }
        }

        // 산술 평균
        double avg = (double) sum / N;
        int mean = (int) Math.round(avg);

        // 중앙값
        int count = 0;
        int median = 0;
        int mid = (N + 1) / 2;
        for (int i = min; i <= max; i++) {
            count += freq[i + 4000];
            if (count >= mid) {
                median = i;
                break;
            }
        }

        // 최빈값
        int maxFreq = 0;
        for (int i = min; i <= max; i++) {
            if (freq[i + 4000] > maxFreq) {
                maxFreq = freq[i + 4000];
            }
        }

        int mode = 0;
        boolean firstFound = false;
        for (int i = min; i <= max; i++) {
            if (freq[i + 4000] == maxFreq) {
                if (!firstFound) {
                    mode = i;
                    firstFound = true;
                } else {
                    mode = i;
                    break;
                }
            }
        }

        // 범위
        int range = max - min;

        StringBuilder sb = new StringBuilder();
        sb.append(mean).append("\n");
        sb.append(median).append("\n");
        sb.append(mode).append("\n");
        sb.append(range).append("\n");
        System.out.println(sb);

    }
}

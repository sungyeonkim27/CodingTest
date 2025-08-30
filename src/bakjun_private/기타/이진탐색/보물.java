package bakjun_private.기타.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 보물 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        boolean[] used = new boolean[N];


        for (int i = 0; i < N; i++) {
            int maxVal = -1;
            int maxIdx = -1;
            for (int j = 0; j < N; j++) {
                if (!used[j] && maxVal < B[j]) {
                    maxVal = B[j];
                    maxIdx = j;
                }
            }

            sum += A[i] * maxVal;
            used[maxIdx] = true;
        }
        System.out.println(sum);
    }
}

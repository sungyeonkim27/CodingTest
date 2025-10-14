package bakjun_private.집합과맵.대칭차집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Set<Integer> set = new HashSet<>();
        int[] numbers = new int[100000001];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
            numbers[num]++;
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
            numbers[num]++;
        }

        int count = 0;
        for (int num : set) {
            if (numbers[num] > 1) {
                count++;
            }
        }

        System.out.print(A + B - (2 * count));
    }
}

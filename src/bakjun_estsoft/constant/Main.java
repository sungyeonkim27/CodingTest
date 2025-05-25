package bakjun_estsoft.constant;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int reversedA = reverse(A);
        int reversedB = reverse(B);

        System.out.println(Math.max(reversedA, reversedB));

    }

    public static int reverse(int num) {
        int result = 0;
        while (num > 0) {
            int digit = num % 10;
            result = result * 10 + digit;
            num /= 10;
        }
        return result;
    }


}

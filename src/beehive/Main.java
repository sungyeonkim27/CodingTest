package beehive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(hiveLevel(N));
    }

    public static int hiveLevel(int N) {
        //n(n + 1) = (N - 1) / 3 식의 해를 구함
        double right = 1.0 * (N - 1) / 3;
        double a = 1;
        double b = 1;
        double c = -right;

        double n1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        return (int)Math.ceil(n1) + 1;
    }
}

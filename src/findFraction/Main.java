package findFraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int line = 1;
        int count = 0;

        while (X > count + line) {
            count += line;
            line++;
        }

        int pos = X - count;

        int a, b;

        if (line % 2 == 0) {
            a = pos;
            b = line - pos + 1;
        } else {
            a = line - pos + 1;
            b = pos;
        }

        System.out.println(a + "/" + b);

    }
}

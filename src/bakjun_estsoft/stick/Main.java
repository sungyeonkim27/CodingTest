package bakjun_estsoft.stick;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int stick = 64;
        int count = 0;

        if (X == 64) {
            count = 1;
        }

        while (X % stick != 0) {
            stick /= 2;

            if (X > stick) {
                X = X % stick;
                count++;
            } else if (X < stick) {
                continue;
            } else {
                count++;
                break;
            }
        }




        System.out.println(count);
    }

}

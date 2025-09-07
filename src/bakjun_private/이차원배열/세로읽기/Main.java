package bakjun_private.이차원배열.세로읽기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] toy = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                toy[i][j] = String.valueOf(line.charAt(j));
            }

            for (int j = line.length(); j < 15; j++) {
                toy[i][j] = "";
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(toy[j][i]);
            }
        }
    }

}

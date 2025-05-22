package findAlphabet;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        int[] alphabet = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
             char c = S.charAt(i);
            int idx = c - 'a';

            if (alphabet[idx] == -1) {
                alphabet[idx] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            bw.write(alphabet[i] + (i == 25 ? "" : " "));
        }
        bw.flush();
        bw.close();
        br.close();
    }

}

package dryCleaner;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int Quater = 0;
        int Dime = 0;
        int Nickel = 0;
        int Penny = 0;

        for (int i = 0; i < T; i++) {
            int money = Integer.parseInt(br.readLine());
            Quater = money / 25;
            money %= 25;
            Dime = money / 10;
            money %= 10;
            Nickel = money / 5;
            Penny = money % 5;
            bw.write(Quater + " " + Dime + " " + Nickel + " " + Penny + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

package bakjun_estsoft.snail;
import java.io.*;

import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer ABV = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(ABV.nextToken());
        int B = Integer.parseInt(ABV.nextToken());
        int V = Integer.parseInt(ABV.nextToken());

        int day = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            day++;
        }
        bw.write(day + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}

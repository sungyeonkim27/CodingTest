package bakjun_private.약수배수와소수.배수와약수;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (A != 0) {
            String result = "";
            if (A > B) {
                result = A % B == 0 ? "multiple" : "neither";
            } else {
                result = B % A == 0 ? "factor" : "neither";
            }
            System.out.println(result);
            st = new StringTokenizer(sc.nextLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
        }
    }
}

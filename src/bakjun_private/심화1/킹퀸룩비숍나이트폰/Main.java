package bakjun_private.심화1.킹퀸룩비숍나이트폰;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 8};
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        for (int i = 0; i < 6; i++) {
            int num = arr[i] - Integer.parseInt(st.nextToken());
            System.out.print(num + " ");
        }
    }
}

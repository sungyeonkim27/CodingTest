package bakjun_private.일차원배열.x보다작은수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st1 = new StringTokenizer(sc.nextLine());
        int N = Integer.parseInt(st1.nextToken());
        int X = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(sc.nextLine());
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st2.nextToken());
            if (X > num) {
                arr.add(num);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }


    }
}

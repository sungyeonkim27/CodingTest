package bakjun_private.일차원배열.나머지;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            result.add(sc.nextInt() % 42);
        }

        System.out.println(result.size());
    }
}

package bakjun_private.일차원배열.과제안내신분;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> students = new TreeSet<>();
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 30; i++) {
            students.add(i);
        }

        for (int i = 0; i < 28; i++) {
            students.remove(sc.nextInt());
        }
        for (Integer student : students) {
            System.out.println(student);
        }
    }
}
